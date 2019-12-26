package chap07.oop;
/*
 * <<상속관계에서 메소드가 갖는 특징>>
 * 1. 상속관계에서는 상위 클래스에 정의된 메소드를 하위 클래스에서 사용할 수 있다.
 * 	  => 하위 클래스 참조 변수를 통해서 접근할 수 있다
 * 2. 상위클래스에 정의된 메소드와 동일한 메소드를 하위클래스에서 정의하고 사용할 수 있다.
 * 	    이 경우 하위클래스의 메소드가 호출된다.
 * 	  => 상위 클래스에 선언된 메소드와 동일한 메소드를 하위클래스에 정의하는 것을
 *       메소드 재정의(메소드 오버라이딩)라고 한다.
 *                ------------
 *             반드시 메소드명, 매개변수 갯수, 타입, 리턴타입 모두 동일 해야된다.
 * 3. 부모클래스의 메소드를 사용하고 싶은 경우 super로 호출한다. 
*/
class Parent{
	public void display() {
		System.out.println("부모의 display...");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("자식 클래스의 display");
	}
	public void test() {
		System.out.println("자식 클래스의 test...");
		display();
	}
}

public class InheritanceTest02 {
	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();
	}

}
