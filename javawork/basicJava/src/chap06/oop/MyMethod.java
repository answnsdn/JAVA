package chap06.oop;
//메소드 정의하는 연습을 위한 클래스
public class MyMethod {
	//4. 매개변수, 리턴값이 모두 있는 메소드
	//=> 숫자 2개를 매개변수로 전달받아 더한 결과를 리턴하는 메소드
	//	 메소드 선언부에 리턴타입을 정의하는 경우 반드시 메소드의 마지막에서
	//	 값을 return해야 한다.
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	//3. 리턴값이 없고 매개변수가 두 개인 메소드
	public void display(String str, int count) {
		for(int i=0;i<count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//2. 리턴값이 없고 매개변수가 한 개인 메소드
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	//1. 매개변수가 없고 리턴값이 없는 메소드
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
