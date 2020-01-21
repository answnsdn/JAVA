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

@WebServlet(name = "list", urlPatterns = { "/dept/list.do" })
public class ListServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw =  response.getWriter();
		System.out.println("서블릿");
		//1.요청정보추출
		//2.비지니스메소드 호출
		DeptDAO dao = new DeptDAO();
		ArrayList<DeptDTO> deptlist = dao.getDeptList();
		//3. 데이터공유
		request.setAttribute("deptlist",deptlist);
		//4. 요청재지정
		RequestDispatcher rd=
			request.getRequestDispatcher("/dept/list.jsp");
		rd.forward(request, response);
		
	}

}










