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
		int result = 0; //메소드 실행결과가 저장될 변수
		try {
			//1. 오라클 드라이버 로딩
			
			
			//2. DBMS에 연결하기 - 연결정보를 정의
			con = DBUtil.getConnect();
			
			//3. PrepareStatement 생성
			stmt = con.prepareStatement(sql);
			//4. ?에 값 전달하기
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			//4. sql실행하기
			result = stmt.executeUpdate();
			//5. 결과처리하기
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
		}finally {
			DBUtil.close(null,stmt,con);
		}
		return result;
	}
	public int insert(BoardDTO board) {
		System.out.println("dto사용메소드:"+board);
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql
= "insert into tb_board values(board_seq.nextval,'"+ id + "','" + title + "','" + content + "',sysdate,0)";*/
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		int result = 0; //메소드 실행결과가 저장될 변수
		try {
			//1. 오라클 드라이버 로딩
			
			
			//2. DBMS에 연결하기 - 연결정보를 정의
			con = DBUtil.getConnect();
			
			//3. PrepareStatement 생성
			stmt = con.prepareStatement(sql);
			//4. ?에 값 전달하기
			stmt.setString(1, board.getId());
			stmt.setString(2, board.getTitle());
			stmt.setString(3, board.getContent());
			
			//4. sql실행하기
			result = stmt.executeUpdate();
			//5. 결과처리하기
			System.out.println(result+"개 행 삽입성공");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
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
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
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
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
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
			//select문을 실행 
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			while(rs.next()) {//=> 레코드를 조회하기 위해서는
							  //   래코드가 한 개라도 반드시 커서를 이동시켜야 한다.
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
