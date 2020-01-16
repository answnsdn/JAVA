package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;

public class MemberDAOImpl implements MemberDAO {

	
	public int insert(MemberDTO member) {
		Connection con = null;
		PreparedStatement stmt = null;
		String sql = "insert into member values(?,?,?,?,?,sysdate,1000)";
		int result = 0;
		try {
			
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql);
			stmt.setString(1, member.getId());
			stmt.setString(2, member.getPass());
			stmt.setString(3, member.getName());
			stmt.setString(4, member.getAddr());
			stmt.setString(5, member.getDeptno());
			result = stmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null,stmt,con);
		}
		return result;
	}
	public int update(String id,String addr) {
		Connection con = null;
		PreparedStatement stmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("update member ");
		sql.append("set id = ? ");
		sql.append("where addr = ?");
		
		int result=0;
		try {
			
			
			con = DBUtil.getConnect();
			
			stmt = con.prepareStatement(sql.toString());
			
			stmt.setString(1, id);
			stmt.setString(2, addr);
		
			result = stmt.executeUpdate();
			
			
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}
		return result;
	}
	public int delete(String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete member " );
		
		sql.append("where id = ? ");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setString(1, id);
		
			result = stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
		}finally {
			DBUtil.close(null, stmt, con);
		}	
		return result;

	}
	
	public ArrayList<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		//조회한 게시글을 담을 객체
		//객체를 생성하지 않고 null로 초기화하는 이유 : 데이터를 조회하는 작업을 하는 곳이 while문 내부이므로
		// while문 안에서 객체를 생성
		MemberDTO member = null;
		String sql = "select * from member";
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
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getString(5));
				//2.DTO로 변환하는 레코드를 ArrayList에 추가
				memberlist.add(member);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return memberlist;
	}
	
	public ArrayList<MemberDTO> findByAddr(String addr) {
		// TODO Auto-generated method stub
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		MemberDTO member = null;
		String sql = "select * from member where addr like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			stmt.setString(1,"%"+addr+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {//=> 레코드를 조회하기 위해서는
							  //   래코드가 한 개라도 반드시 커서를 이동시켜야 한다.
				//1. 조회한 레코드의 컬럼을 읽어서 DTO로 변환하는 작업
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getString(5));
				//2.DTO로 변환하는 레코드를 ArrayList에 추가
				memberlist.add(member);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return memberlist;
		
	}
	
	public MemberDTO login(String id, String pass) {
		// TODO Auto-generated method stub
		MemberDTO member = null;
		String sql = "select * from member where id =  ? and pass = ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, pass);
			rs = stmt.executeQuery();
			if(rs.next()) {
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getString(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return member;
	}
}

