package dept;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
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
		
	
		request.setAttribute("result", deptlist);
		System.out.println("ListServlet 실행완료");
		
		//4. 응답화면으로 요청 재지정
		RequestDispatcher rd = 
				request.getRequestDispatcher("/dept/list.jsp");
		rd.include(request, response);
	}
}

