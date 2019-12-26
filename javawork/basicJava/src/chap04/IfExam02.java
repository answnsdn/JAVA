package chap04;

import java.util.Scanner;

//성별과 나이를 입력 받아서 다음과 같이 출력하기
//입력값 : 1,3은 남자 2,4는 여자
//		나이 1~19	:	청소년
//			20	:	성인
//성별 3과 나이 20을 입력한 경우
// 성인남자
public class IfExam02 {
	public static void main(String[] args) {
		Scanner scanVal = new Scanner(System.in);
		System.out.print("성별:");
		int gender = scanVal.nextInt();
		System.out.print("나이:");
		int age = scanVal.nextInt();
		if (gender < 1 | gender > 4) {
			System.out.println("올바른 숫자 입력");
		}
		else{
			if (gender == 1 || gender == 3) {
				if (age >= 1 && age <= 19) {
					System.out.println("청소년남자");
				} else {
					System.out.println("성인남자");
				}
			} else {
				if (gender == 2 || gender == 4) {
					if (age >= 1 && age <= 19) {
						System.out.println("청소년여자");
					} else {
						System.out.println("성인여자");
					}
				}
			}
		}
	}

}
