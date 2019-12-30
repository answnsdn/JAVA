package jdbc.member.exam;
import java.util.ArrayList;
import java.util.Scanner;

import jdbc.board.exam.BoardDTO;

public class MenuUI {
	Scanner key = new Scanner(System.in);
	MemberDAO dao = new MemberDAOImpl();
	public void insertMenu(){
		//입사일은 오늘날짜 - sysdate, point = 1000가 삽입 되도록
		System.out.println("*******사원등록********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		String pass = key.next();
		System.out.print("이름:");
		String name = key.next();
		System.out.print("주소:");
		String addr = key.next();
		System.out.print("부서번호:");
		String deptno = key.next();
	
		//여기에서 EmpDAO의 메소드를 호출하세요
		MemberDTO member = new MemberDTO(id,pass,name,addr,deptno);
		int result = dao.insert(member);
		if(result>0) {
			System.out.println("등록 성곰");
		}else {
			System.out.println("등록 실패");
		}
	}
	public void updateMenu(){
		System.out.println("*******사원수정********");
		System.out.print("아이디:");
		String id = key.next();
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		
		int result = dao.update(id,addr);
		if(result>0) {
			System.out.println("수정 성곰");
		}else {
			System.out.println("수정 실패");
		}
	}
	public void deleteMenu(){
		System.out.println("*******사원삭제********");
		System.out.print("아이디:");
		String id = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		int result = dao.delete(id);
		if(result>0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("삭제 실패");
		}
	}
	public void findByAddrMenu(){
		System.out.println("*******사원검색********");
		System.out.print("주소:");
		String addr = key.next();
		//여기에서 EmpDAO의 메소드를 호출하세요
		ArrayList<MemberDTO> memberlist = dao.findByAddr(addr);
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
		MemberDTO member = memberlist.get(i);
		System.out.println(member.getId()+"\t"+member.getPass()+"\t"+member.getPass()+"\t"+member.getAddr()+'\t'+member.getDeptno());
		
		
		}
		
	}
	
	
	public void selectMenu(){
		System.out.println("*******사원조회********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 전체사원조회
		ArrayList<MemberDTO> memberlist = dao.memberList();
		int size = memberlist.size();
		for(int i=0;i<size;i++) {
			MemberDTO member = memberlist.get(i);
			
			System.out.println(member.getId()+'\t'+member.getPass()+'\t'+member.getName()+'\t'+member.getAddr()+'\t'+member.getDeptno());
			
		}
	}
	public void loginMenu(){
		System.out.println("*******로그인********");
		//여기에서 EmpDAO의 메소드를 호출하세요 - 로그인 성공, 실패
		
		System.out.println("아이디:");
		String id = key.next();
		System.out.print("패스워드:");
		
		String pass = key.next();
		MemberDTO member = dao.login(id,pass);
		if(member == null) {
			System.out.println("로그인 실패");
		}
		//여기에서 BoardDAO의 메소드를 호출하세요
		else{
			System.out.println("로그인 성공");
		
		
		}
	}
}


















