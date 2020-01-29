package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController{

	@RequestMapping("/test.do")
	public ModelAndView test() {
		// TODO Auto-generated method stub
		System.out.println("컨트롤러 요청");
		
		ModelAndView mav = new ModelAndView();
		String data="";
		for(int i=0;i<=9;i++) {
			data = data+(9+"*"+i+"="+(9*i))+"<br/>";
		}
		
		mav.addObject("msg",data);
		
		
		mav.setViewName("test/result");
		return mav;
		
		
		
	}

}
