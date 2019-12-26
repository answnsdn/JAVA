package chap07.oop;
public class Teacher extends Person{
//	private String name;
//	private int age;
	private String subject;
	public Teacher() {
		
	}
	public Teacher(String name, int age, String subject) {
		/*super();
		this.name = name;
		this.age = age;*/
		super(name,age);
		this.subject = subject;
	}
	public void print() {
		super.print();
		System.out.println(" °ú¸ñ:" +this.getSubject());
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
}
