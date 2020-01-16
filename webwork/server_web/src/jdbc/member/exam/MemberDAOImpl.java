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
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace();// ��������
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
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace();// ��������
		}finally {
			DBUtil.close(null, stmt, con);
		}	
		return result;

	}
	
	public ArrayList<MemberDTO> memberList() {
		// TODO Auto-generated method stub
		
		ArrayList<MemberDTO> memberlist = new ArrayList<MemberDTO>();
		//��ȸ�� �Խñ��� ���� ��ü
		//��ü�� �������� �ʰ� null�� �ʱ�ȭ�ϴ� ���� : �����͸� ��ȸ�ϴ� �۾��� �ϴ� ���� while�� �����̹Ƿ�
		// while�� �ȿ��� ��ü�� ����
		MemberDTO member = null;
		String sql = "select * from member";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select���� ���� 
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=> ���ڵ带 ��ȸ�ϱ� ���ؼ���
							  //   ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getString(5));
				//2.DTO�� ��ȯ�ϴ� ���ڵ带 ArrayList�� �߰�
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
			//select���� ���� 
			stmt = con.prepareStatement(sql);
			stmt.setString(1,"%"+addr+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {//=> ���ڵ带 ��ȸ�ϱ� ���ؼ���
							  //   ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				member = new MemberDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getString(5));
				//2.DTO�� ��ȯ�ϴ� ���ڵ带 ArrayList�� �߰�
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
			//select���� ���� 
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

