package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardDAOImpl implements BoardDAO {

	public int insert(String id,String title, String content) {
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql
= "insert into tb_board values(board_seq.nextval,'"+ id + "','" + title + "','" + content + "',sysdate,0)";*/
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //�޼ҵ� �������� ����� ����
		try {
			//1. ����Ŭ ����̹� �ε�
			
			
			//2. DBMS�� �����ϱ� - ���������� ����
			con = DBUtil.getConnect();
			
			//3. PrepareStatement ����
			stmt = con.prepareStatement(sql);
			//4. ?�� �� �����ϱ�
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			//4. sql�����ϱ�
			result = stmt.executeUpdate();
			//5. ���ó���ϱ�
			System.out.println(result+"�� �� ���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace();// ��������
		}finally {
			DBUtil.close(null,stmt,con);
		}
		return result;
	}
	public int insert(BoardDTO board) {
		System.out.println("dto���޼ҵ�:"+board);
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql
= "insert into tb_board values(board_seq.nextval,'"+ id + "','" + title + "','" + content + "',sysdate,0)";*/
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //�޼ҵ� �������� ����� ����
		try {
			//1. ����Ŭ ����̹� �ε�
			
			
			//2. DBMS�� �����ϱ� - ���������� ����
			con = DBUtil.getConnect();
			
			//3. PrepareStatement ����
			stmt = con.prepareStatement(sql);
			//4. ?�� �� �����ϱ�
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			
			//4. sql�����ϱ�
			result = stmt.executeUpdate();
			//5. ���ó���ϱ�
			System.out.println(result+"�� �� ���Լ���");
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace();// ��������
		}finally {
			DBUtil.close(null,stmt,con);
		}
		return result;
	}
	public int update(int boardNum, String id) {
		Connection con = null;
		PreparedStatement stmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board ");
		sql.append("set id = ? ");
		sql.append("where boardNum = ?");
		
		int result=0;
		try {
			
			
			con = DBUtil.getConnect();
			
			stmt = con.prepareStatement(sql.toString());
			
			stmt.setInt(2, boardNum);
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
	public int delete(int boardNum) {
		Connection con = null;
		PreparedStatement stmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board " );
		
		sql.append("where boardnum = ? ");
		int result = 0;
		try {
			con = DBUtil.getConnect();
			stmt = con.prepareStatement(sql.toString());
			stmt.setInt(1, boardNum);
		
			result = stmt.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("�������:"+e.getMessage());
			e.printStackTrace();// ��������
		}finally {
			DBUtil.close(null, stmt, con);
		}	
		return result;

	}
	public void Select() {
		String sql = "select * from tb_board";
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
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString("content")+"\t");
				System.out.print(rs.getDate(5)+"\t");
				System.out.println(rs.getInt(6)+"\t");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		
	}
	

}