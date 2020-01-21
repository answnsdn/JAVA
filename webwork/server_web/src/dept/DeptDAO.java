package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;
import jdbc.member.exam.MemberDTO;

public class DeptDAO {
	public DeptDTO read(String deptNo) {
		System.out.println("dao의 read호출");
		DeptDTO dept = null;
		String sql = "select * from mydept where deptNo=?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, deptNo);
			rs = stmt.executeQuery();//select실행
			//실행결과를 자바객체로 변환 
			// - 레코드가 여러 개: DTO로 레코드를 변환하고 ArrayList에 add
			// - 레코드가 한 개 : DTO로 레코드 변환
			if(rs.next()) {
				dept = new DeptDTO(rs.getString(1),
						rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}	
		return dept;
	}
	public int delete(String deptNo) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "delete from mydept where deptno=?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptNo);			
			result = ptmt.executeUpdate();
			System.out.println("result=>"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	//전체 목록 출력
	public ArrayList<DeptDTO> getDeptList(){
		System.out.println("getDeptList호출=> 서블릿이 넘겨준 파라미터출력");
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDTO dept = null;
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println("while");
				dept = new DeptDTO(rs.getString(1),
						rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5));
				deptlist.add(dept);
			}
			System.out.println("dao=>"+deptlist.size());
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return deptlist;
	}
	
	//부서등록
	public int insert(DeptDTO dept) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql = "insert into mydept values(?,?,?,?,?)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			result = ptmt.executeUpdate();
			System.out.println("result=>"+result);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;

	}


}
