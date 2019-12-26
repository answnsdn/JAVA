package chap04;

import java.util.Scanner;

//숫자를 입력받아서 음수인지 양수인지 출력하기
//단, 양수인 경우에는 짝수이지 홀수인지 출력하기
//음수 -> __는 음수입니다.
public class IfExam01 {

	public static void main(String[] args) {
		Scanner numScan = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int numVal = numScan.nextInt();
		if(numVal>0) {
			if(numVal%2==0) {
				System.out.println(numVal+"은(는) 짝수입니다");
			}
			else {
				System.out.println(numVal+"은(는) 홀수입니다");
			}
		}
		else {
			System.out.println(numVal+"은(는) 음수입니다");
		}
	}

}
