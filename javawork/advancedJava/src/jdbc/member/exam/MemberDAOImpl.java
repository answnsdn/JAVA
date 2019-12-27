package jdbc.member.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.board.exam.DBUtil;

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
}

