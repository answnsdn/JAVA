package chap07.oop;

public class Student extends Person{
//	private String name;
//	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
	}
	public Student(String name, int age, int korean, int english, int math, int science) {
		/*super();
		this.name = name;
		this.age = age;*/
		super(name,age);//�θ��� private ����� ���� ������ ���� �ʰ� �����ڸ� ȣ���Ͽ� �����Ѵ�.
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public double getAvg() {
		int sum = this.korean + this.english + this.math + this.science;
		return (double)sum/4;
	}
	
	public String getGrade() {
		String grade = "";
		double avg = this.getAvg();
		if(avg >=90) {
			grade = "A����";
		}else if(avg >=70) {
			grade = "B����";
		}else if(avg >=50) {
			grade = "C����";
		}else if(avg >=30) {
			grade = "D����";
		}else {
			grade = "F����";
		}
		return grade;
	}
	
	public void print() {
		super.print();
		System.out.println(" ���:" +this.getAvg()+" ����: "+this.getGrade());
	}
	public static void show() {
		System.out.println("==============");
	}
}