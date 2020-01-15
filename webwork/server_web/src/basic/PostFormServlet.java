package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		//1.요청정보 추출
		req.setCharacterEncoding("euc-kr");
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] fav = req.getParameterValues("item");
		
		
		System.out.println("아이디 : "+id);
		System.out.println("성명: "+name);
		System.out.println("비번 : "+pass);
		System.out.println("성별: "+gender);
		System.out.println("직업 : "+job);
		for(int i=0;i<fav.length;i++) {
			System.out.println("취미 : "+fav[i]);
		}
		
		
		
		
	}
}
