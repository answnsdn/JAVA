package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "deptinsert", urlPatterns = { "/deptinsert.do" })
public class DeptServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw =  response.getWriter();
		System.out.println("����");
		//1. ��û���� ����
		String deptNo = request.getParameter("deptNo");
		String deptName = request.getParameter("deptName");
		String loc = request.getParameter("loc");
		String tel = request.getParameter("tel");
		String mgr = request.getParameter("mgr");
		DeptDTO dept = new DeptDTO(deptNo, deptName, loc, tel, mgr);
		System.out.println(dept);
		//2. �����Ͻ��޼ҵ� call
		DeptDAO dao = new DeptDAO();
		int result = dao.insert(dept);
		
		//3. �����Ͱ���
		request.setAttribute("insertresult", result);
		
		//4. ����ȭ������ ��û������
		RequestDispatcher rd=
			request.getRequestDispatcher("/dept/insertResult.jsp");
		rd.forward(request, response);
	
		
	}

}






