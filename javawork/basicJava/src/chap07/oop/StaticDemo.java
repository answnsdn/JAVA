package chap07.oop;
//static변수를 연습할 수 있는 예제
//static으로 선언한 변수는 인스턴스의 고유한 값을 저장하는 인스턴스 변수가 아니므로
//인스턴스변수로 접근할 수 없다.
//클래스명으로 접근해야 한다.
public class StaticDemo {
	String name;
	int num;
	static int staticNum;
	public StaticDemo() {
	}
	public StaticDemo(String name) {
		this.name = name;
		num++;
		staticNum++;
	}
	public void display() {
		System.out.println("name:"+name+",num:"+num+",staticnum:"+staticNum);
	}
}
