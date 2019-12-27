package chap06.oop;
//- ��������� ������ �� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
//- public
//- default
//- protected
//- private
//Ŭ������ ������ �� ��� ������ private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
//public �޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
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
	//��� ��������� private���� ����Ǿ� �ֱ� ������
	//���� �����ϴ� �޼ҵ�� ������ ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�
	//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	//name������ ���� �����ϴ� �޼ҵ�
	//�޼ҵ�� : set + ���������(ù ���ڸ� �빮�ڷ�)
	//			setName
	public void setName(String name) {	//setter �޼ҵ�
		this.name = name;
	}
	
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ�� : get + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//			getName
	public String getName() {//getter �޼ҵ�
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