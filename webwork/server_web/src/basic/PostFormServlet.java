package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostFormServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		//1.��û���� ����
		req.setCharacterEncoding("euc-kr");
		String id = req.getParameter("userId");
		String name = req.getParameter("userName");
		String pass = req.getParameter("passwd");
		String gender = req.getParameter("gender");
		String job = req.getParameter("job");
		String[] fav = req.getParameterValues("item");
		
		
		System.out.println("���̵� : "+id);
		System.out.println("����: "+name);
		System.out.println("��� : "+pass);
		System.out.println("����: "+gender);
		System.out.println("���� : "+job);
		for(int i=0;i<fav.length;i++) {
			System.out.println("��� : "+fav[i]);
		}
		
		
		
		
	}
}
