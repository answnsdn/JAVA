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
		System.out.println("********�Խñ� ���*********");
		System.out.println("���̵�: ");
		String id = key.next();
		System.out.println("����: ");
		String title = key.next();
		System.out.println("����: ");
		String content = key.next();
		System.out.println("��ȣ : ");
		int boardNum = key.nextInt();
		
		
		obj.insert(id,title,content);
			obj.delete(boardNum);
		obj.Select();
	
		
		}
	

}
