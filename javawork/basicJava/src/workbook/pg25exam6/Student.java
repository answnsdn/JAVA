package workbook.pg25exam6;

public class Student {
	private String name;
	private int age;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() {
	}
	public Student(String name, int age, int korean, int english, int math, int science) {
		super();
		this.name = name;
		this.age = age;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
			grade = "A학점";
		}else if(avg >=70) {
			grade = "B학점";
		}else if(avg >=50) {
			grade = "C학점";
		}else if(avg >=30) {
			grade = "D학점";
		}else {
			grade = "F학점";
		}
		return grade;
	}
	
	public void print() {
		System.out.println("성명:"+this.getName()+" 나이: "+this.getAge()
							+" 평균:" +this.getAvg()+" 학점: "+this.getGrade());
	}
	public static void show() {
		System.out.println("==============");
	}
}
