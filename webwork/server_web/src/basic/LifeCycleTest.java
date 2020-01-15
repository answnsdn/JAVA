package basic;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleTest extends HttpServlet{
	public LifeCycleTest() {
		System.out.println("º≠∫Ì∏¥∞¥√ºª˝º∫...");
	}
	public void init() {
		System.out.println("º≠∫Ì∏¥∞¥√º¿« √ ±‚»≠ init()...");
	}
	public void service(HttpServletRequest req,
							HttpServletResponse res)
							throws ServletException,IOException{
		System.out.println("≈¨∂Û¿Ãæ∆Æ¿« ø‰√ª √≥∏Æ service()^^...."+req.getMethod());
		if(req.getMethod().equals("GET")) {
			doGet(req,res);
		}else{
				doPost(req,res);
			}
		
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet()...");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost()...");
	}
	public void destroy() {
		System.out.println("º≠∫Ì∏¥∞¥√ºº“∏Í....destroy()..");
	}
}






