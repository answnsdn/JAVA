package chap04;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int num = 0;
		while(num>10) {
			System.out.print("숫자입력:");
			num = key.nextInt();
			System.out.println("while문 실행"+num);
		}
		do {
			System.out.print("숫자입력:");
			num = key.nextInt();
			System.out.println("do_while문 - 실행명령문:"+num);
		}while(num>10);
	}

}
