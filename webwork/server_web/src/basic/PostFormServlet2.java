package basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostFormServlet2
 */
@WebServlet(name = "Mypost2", urlPatterns = { "/Mypost2.do" })
public class PostFormServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr;");
		PrintWriter pw = response.getWriter();
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] item = request.getParameterValues("item");
		
		//응답내용을 생성
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1>고객정보</h1>");
		pw.print("<h3>아이디:"+userId+"</h3>");
		pw.print("<h3>아이디:"+userName+"</h3>");
		pw.print("<h3>Favorites:</h3>");
		for(String data : item) {
			pw.print(data+"");
		}
	}

}
