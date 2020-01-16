package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListServlet
 */
@WebServlet(name = "list", urlPatterns = { "/list.do" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//System.out.println("서블릿성공!!!!");
		//1.비즈니스 메소드 호출
		DeptDAO dao=new DeptDAO();
		ArrayList<DeptDTO> deptlist = dao.deptList();
		
		//2.응답메세지 출력
		
		int size = deptlist.size();
		for(int i=0;i<size;i++) {
			DeptDTO dept = deptlist.get(i);
			pw.print("<table border='1' width='500px'>");
			pw.print("<tr>");
			pw.print("<td>"+dept.getDeptNo()+"</td>");
			pw.print("<td>"+dept.getDeptName()+"</td>");
			pw.print("<td>"+dept.getLoc()+"</td>");
			pw.print("<td>"+dept.getTel()+"</td>");
			pw.print("<td>"+dept.getMgr()+"</td>");
			pw.print("<td><a href='/server_web/dept/delete.do?deptNo="+dept.getDeptNo()+"&info=test'>삭제</a></td>");
			pw.print("</tr>");
			pw.print("</table>");
			
	}
	}
}

