package chap06.oop;
//클래스를 정의하고 멤버변수를 정의하는 방법
// - 멤버변수를 정의할때는 특별한 경우를 제외하고 초기값을 주지 않는다.
// - 초기값을 정의하지 않아도 참조형은 null. 정수형은 0, 실수형 0.0, boolean은 false
// - 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
// - public
// - default
// - protected
// - private

public class PersonTest {
	public static void main(String[] args) {
		/*Person p1 = new Person();
		p1.setName("장동건");
		p1.setAddr("서울시");
		p1.setAge(45); // age변수는 private으로 선언되어 있으므로 
					// 같은 패키지의 클래스에서도 접근할 수 없다.
		System.out.println("성명:"+p1.getName());
		System.out.println("주소:"+p1.getAddr());
		System.out.println("나이:"+p1.getAge());
		
		Person p2 = new Person();
		p2.setName("이이이");
		p2.setAddr("나나난");
		p2.setAge(15);
		System.out.println("성명:"+p2.getName());
		System.out.println("주소:"+p2.getAddr());
		System.out.println("나이:"+p2.getAge());
		*/
		Person p3 = new Person("다다다","서서서우울시이이",999);
		p3.print();
	}

}
