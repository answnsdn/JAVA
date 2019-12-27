package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BoardDAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		BoardDAOImpl obj = new BoardDAOImpl();
		System.out.println("********게시글 등록*********");
		System.out.println("아이디: ");
		String id = key.next();
		System.out.println("제목: ");
		String title = key.next();
		System.out.println("내용: ");
		String content = key.next();
		System.out.println("번호 : ");
		int boardNum = key.nextInt();
		
		
		obj.insert(id,title,content);
			obj.delete(boardNum);
		obj.Select();
	
		
		}
	

}
