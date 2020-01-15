package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuGuservlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		int num = 7;
		for(int i=1;i<10;i++) {
			int con = num * i;
			System.out.println(con);
		}
		System.out.println("¼­ºí¸´ ¿äÃ»!!!!");
		
	}

}
