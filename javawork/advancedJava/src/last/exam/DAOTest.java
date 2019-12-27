package last.exam;

import java.util.Scanner;


public class DAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.println("******회원관리시스템********");
		System.out.println("1. 회원등록");
		System.out.println("2. 회원수정");
		System.out.println("3. 회원삭제");
		System.out.print("원하는 작업을 선택하세요:");
		int choice  = key.nextInt();
		show(choice);
	}
	public static void show(int choice){
		CustomerUI ui = new CustomerUI();
		switch(choice){
			case 1:
				ui.insertMenu();
				break;
			case 2:
				ui.updateMenu();
				break;
			case 3:
				ui.deleteMenu();
				break;
			
		}
	}

}
