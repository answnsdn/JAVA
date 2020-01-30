package multi.erp.emp;
//emp테이블에서 작업하는 모든 내용에 대한 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpController {
	@RequestMapping("/emp/login.do")
	public String login() {
		return "login"; //tiles에 등록된 login을 기준으로 view를 만들어라
	}
}
