package chap06.oop;
//- 멤버변수를 정의할 때 접근 제어자를 추가해서 접근을 제어할 수 있다.
//- public
//- default
//- protected
//- private
//클래스를 정의할 때 멤버 변수는 private으로 선언해서 외부에서 접근할 수 없도록 정보를 은닉하고
//public 메소드를 통해서 접근할 수 있도록 구현한다.
public class Person {
	private String name;
	private String addr;
	private int age;
	
	public Person() {
	}
	/*public Person(String name) {
		this.name = name;
	}
	public Person(String name, String addr) {
		this(name);
		this.addr = addr;
	}*/
	public Person(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//모든 멤버변수는 private으로 선언되어 있기 때문에
	//값을 설정하는 메소드와 값을ㅇ 가져올 수 있는 메소드가 필요하다
	//이런 역할을 하는 메소드를 정의하는 경우
	//name변수에 값을 설정하는 메소드
	//메소드명 : set + 멤버변수명(첫 글자를 대문자로)
	//			setName
	public void setName(String name) {	//setter 메소드
		this.name = name;
	}
	
	//name변수에 저장된 값을 호출하는 곳으로 넘겨줄 메소드
	//메소드명 : get + 멤버변수명(첫 글자를 대문자로 바꾼)
	//			getName
	public String getName() {//getter 메소드
		return this.name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return this.addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	////////////////////////////////
	public void print() {
		System.out.println(name+","+addr+","+age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}
