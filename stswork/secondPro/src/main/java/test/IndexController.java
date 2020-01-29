package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController{
	//우리가 추가한 main()메소드가 요청될 path를 어노테이션으로 등록
	//RequestMapping안에 정의하는 path는 <bean>의 name속성에 정의하던 path명
	@RequestMapping("/index.do")
	public String main() {
		System.out.println("어노테이션 기반 컨트롤러");
		return "test/index"; //view에 대한 정보
		
	}
}
