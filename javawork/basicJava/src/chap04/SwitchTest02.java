package chap04;

import java.util.Scanner;

//switch연습 - 기본문법(MultiIfTest클래스의 내용을 switch로 변경)
//switch는 if~else if문을 대신할 수 있는 제어문
public class SwitchTest02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("주민번호입력:");
		int ssn = key.nextInt();//7번째 숫자 입력
		switch(ssn) {
			case 1:
			case 3:
				System.out.println("남자");
				break;
			case 2: 
			case 4: 
				System.out.println("여자");
				break;
			default: 
				System.out.println("기타");
		}
	}

}
