package jdbc.board.exam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	//��ȸ�� ����� ArrayList�� ��ȯ�Ͽ� ����
	public ArrayList<BoardDTO> Select() {
		//��ü �Խù��� �㤷�� Collection
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		//��ȸ�� �Խñ��� ���� ��ü
		//��ü�� �������� �ʰ� null�� �ʱ�ȭ�ϴ� ���� : �����͸� ��ȸ�ϴ� �۾��� �ϴ� ���� while�� �����̹Ƿ�
		// while�� �ȿ��� ��ü�� ����
		BoardDTO board = null;
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
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getDate(5),rs.getInt(6));
				//2.DTO�� ��ȯ�ϴ� ���ڵ带 ArrayList�� �߰�
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
		
	}
	
	public ArrayList<BoardDTO> findByTitle(String title){
		ArrayList<BoardDTO> boardlist = new ArrayList<BoardDTO>();
		BoardDTO board = null;
		String sql = "select * from tb_board where title like ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select���� ���� 
			stmt = con.prepareStatement(sql);
			stmt.setString(1,"%"+title+"%");
			rs = stmt.executeQuery();
			while(rs.next()) {//=> ���ڵ带 ��ȸ�ϱ� ���ؼ���
							  //   ���ڵ尡 �� ���� �ݵ�� Ŀ���� �̵����Ѿ� �Ѵ�.
				//1. ��ȸ�� ���ڵ��� �÷��� �о DTO�� ��ȯ�ϴ� �۾�
				board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getDate(5),rs.getInt(6));
				//2.DTO�� ��ȯ�ϴ� ���ڵ带 ArrayList�� �߰�
				boardlist.add(board);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return boardlist;
		
	}
	
	
	@Override
	public BoardDTO read(int boardnum) {
		
		BoardDTO board = null;
		String sql = "select * from tb_board where boardnum =  ?";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			
			con = DBUtil.getConnect();
			//select���� ���� 
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, boardnum);
			rs = stmt.executeQuery();
			if(rs.next()) {
				board = new BoardDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)
						,rs.getDate(5),rs.getInt(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, stmt, con);
		}
		return board;
	}
	

}
