package jdbc.board.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//DBMS�� �����ϴ� �ߺ��� �۾��� ������ Ŭ����
public class DBUtil {
	//����̹� �ε��� Ŭ������ �ε��� �� ���� �ε��ǵ��� ó��
	// => static{}���� ���ɹ��� Ŭ������ �ε��� �� �� ���� ����Ǵ� �ڵ�
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//2.Ŀ�ؼ��ϱ� - DBMS�� ���� �Ŀ� ���������� �����ϰ� �ִ� Connection�� ����
	public static Connection getConnect() {
		Connection con = null;
		String url = "jdbc:oracle:thin:@127.0.0.65:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
		con = DriverManager.getConnection(url, user, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	/*3. �ڿ��ݳ� : con-stmt-rs ������ ����Ǳ� ������ �ݳ��� ���� �������� �ݳ��Ѵ�.
				 ResultSet, Statement, Connection ��ü ����� ����
				 => ������ ��ü�� ������ �� �ֵ��� �޼ҵ带 �����ص� ����.*/
	public static void close(ResultSet rs, Statement stmt, Connection con) {
		try {
			if(rs!=null)rs.close();
			if(stmt!=null)stmt.close();
			if(con!=null)con.close();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}

