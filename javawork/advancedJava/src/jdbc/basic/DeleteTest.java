package jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		DeleteTest obj = new DeleteTest();
		System.out.println("번호 : ");
		int boardNum = key.nextInt();
		
		obj.delete(boardNum);
	}
	public void delete(int boardNum) {
		String url = "jdbc:oracle:thin:@127.0.0.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete tb_board " );
		
		sql.append("where boardnum = ? ");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection(url,user,password);
			
			stmt = con.prepareStatement(sql.toString());
			
			stmt.setInt(1, boardNum);
		
		
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
