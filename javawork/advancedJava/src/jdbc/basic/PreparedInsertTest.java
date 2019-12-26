package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedInsertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		PreparedInsertTest obj = new PreparedInsertTest();
		System.out.println("********게시글 등록*********");
		System.out.println("아이디: ");
		String id = key.next();
		System.out.println("제목: ");
		String title = key.next();
		System.out.println("내용: ");
		String content = key.next();
		
		
		obj.insert(id,title,content);
		}
	public void insert(String id,String title, String content) {
			
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		/*String sql
= "insert into tb_board values(board_seq.nextval,'"+ id + "','" + title + "','" + content + "',sysdate,0)";*/
		String sql = "insert into tb_board values(board_seq.nextval,?,?,?,sysdate,0)";
		try {
			//1. 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. DBMS에 연결하기 - 연결정보를 정의
			con = DriverManager.getConnection(url, user, 
														password);
			
			//3. PrepareStatement 생성
			stmt = con.prepareStatement(sql);
			//4. ?에 값 전달하기
			stmt.setString(1, id);
			stmt.setString(2, title);
			stmt.setString(3, content);
			
			//4. sql실행하기
			int result = stmt.executeUpdate();
			//5. 결과처리하기
			System.out.println(result+"개 행 삽입성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버로딩 실패");
		}catch(SQLException e) {
			System.out.println("연결실패:"+e.getMessage());
			e.printStackTrace();// 오류추적
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(con!=null)con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
