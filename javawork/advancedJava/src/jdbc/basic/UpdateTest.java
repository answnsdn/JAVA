package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		UpdateTest obj = new UpdateTest();
		System.out.println("번호 : ");
		int boardNum = key.nextInt();
		System.out.println("아이디 : ");
		String id = key.next();
		obj.update(boardNum,id);
		
	}
	public void update(int boardNum, String id) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection con = null;
		PreparedStatement stmt = null;
		StringBuffer sql = new StringBuffer();
		sql.append("update tb_board ");
		sql.append("set id = ? ");
		sql.append("where boardNum = ?");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url,user,password);
			
			stmt = con.prepareStatement(sql.toString());
			
			stmt.setInt(2, boardNum);
			stmt.setString(1, id);
		
			int result = stmt.executeUpdate();
			
			
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


