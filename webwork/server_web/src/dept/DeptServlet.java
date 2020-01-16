package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeptServlet
 */
@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr;");
		PrintWriter pw = response.getWriter();
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		 
		
		//비즈니스메소드 call
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		DeptDAO dao=new DeptDAO();
		int result = dao.insert(dept);
		
		pw.print("<h1>삽입성공</h1>");
		pw.print("<hr/>");
		pw.print(result+"개 삽입성공");
		
		//
	}

}
