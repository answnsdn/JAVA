package last.exam;

import java.util.Scanner;


public class DAOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		System.out.println("******ȸ�������ý���********");
		System.out.println("1. ȸ�����");
		System.out.println("2. ȸ������");
		System.out.println("3. ȸ������");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
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
