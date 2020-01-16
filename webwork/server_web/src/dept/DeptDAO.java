package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class DeptDAO {
	//전체 목록 출력
	public ArrayList<DeptDTO> deptList(){
		
		ArrayList<DeptDTO> deptlist = new ArrayList<DeptDTO>();
		DeptDTO dept = null;
		String sql = "select * from mydept";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=> 레코드를 조회하기 위해서는
							  //   래코드가 한 개라도 반드시 커서를 이동시켜야 한다.
				//1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				dept = new DeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),
						rs.getString(4),rs.getString(5));
				//2.DTO로 변환하는 레코드를 ArrayList에 추가
				deptlist.add(dept);
			}
			//System.out.println("dad=>"+deptlist.size());
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
		int result=0;
		String sql="insert into mydept values(?,?,?,?,?)";
		try {
			con = DBUtil.getConnect();
			ptmt=con.prepareStatement(sql);
			ptmt.setString(1, dept.getDeptNo());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			result = ptmt.executeUpdate();
			System.out.println(result);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	//부서삭제
	public int delete(String deptNo) {
		Connection con = null;
		PreparedStatement ptmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete from mydept ");
		sql.append("where deptNo= ?");
		int result=0;
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql.toString());
			ptmt.setString(1, deptNo);
		
			result = ptmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
		}finally {
			DBUtil.close(null, ptmt, con);
		}	
		
		
		
		return result;
	}

}
