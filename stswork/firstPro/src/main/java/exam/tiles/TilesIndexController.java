package exam.tiles;
//메뉴 화면을 선택한 대로 화면을 바꿔가며 보여주는 기능을 수행할 컨트롤러
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TilesIndexController {
	@RequestMapping("/exam/index.do")
	public String index() {
		return "index"; //index라는 이름의 view를 리턴 --> 이 정보를 tiles 설정파일에 등록해야한다. 
	}
	
	@RequestMapping("/menu/mybatis.do")
	public String mybatis() {
		return "menu/mybatis"; //tiles에 등록된 menu/mybatis를 기준으로 view를 만들어라
	}
	
	@RequestMapping("/menu/advanced.do")
	public String advancedView() {
		return "menu/advanced";
	}
}
