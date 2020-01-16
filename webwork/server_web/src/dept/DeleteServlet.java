package dept;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "delete", urlPatterns = { "/dept/delete.do" })
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = response.getWriter();
		//1.요청정보 추출
		String deptNo = request.getParameter("deptNo");
		
		//2.비지니스메소드 호출
		DeptDAO dao = new DeptDAO();
		int result = dao.delete(deptNo);
		//System.out.println(result);
		if(result>0) {
			pw.write("삭제성고이!");
		}else {
			pw.write("시패");
		}
		//3. 요청재지정
	}
	

}
