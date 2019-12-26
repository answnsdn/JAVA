package workbook.pg25exam6;

public class Test06_Array {
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		stu[0] = new Student("Kim", 100, 90, 95, 89);
		stu[1] = new Student("Lee", 60, 70, 99, 98);
		stu[2] = new Student("Park", 68, 86, 60, 40);
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
		}
		/*for(int i=0;i<stu.length;i++) {
		stu[i] = new Student();
		}
		stu[0].setName("Kim");
		stu[0].setKorean(100);
		stu[0].setEnglish(90);
		stu[0].setMath(95);
		stu[0].setScience(89);
		
		stu[1].setName("Lee");
		stu[1].setKorean(60);
		stu[1].setEnglish(70);
		stu[1].setMath(99);
		stu[1].setScience(98);		
		
		stu[2].setName("Park");
		stu[2].setKorean(68);
		stu[2].setEnglish(86);
		stu[2].setMath(60);
		stu[2].setScience(40);
		*/
		
	}

}
