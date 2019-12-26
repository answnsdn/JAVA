package chap07.oop;
final class FinalSuper {
	public final void display() {
		System.out.println("super display");
	}
}
class FinalSub extends FinalSuper{//final 클래스는 상속이 불가능.
	static final int NUM = 100;

	@Override //annotation
	public void display() {//final메소드는 오버라이딩 할 수 없다.
		System.out.println("display");
	}
}

public class FinalTest{
	public static void main(String[] args) {
		FinalSub obj = new FinalSub();
		//obj.NUM = 10000; // final로 선언되어 값 변경 불가
		System.out.println(FinalSub.NUM);
		obj.display();
	}
}