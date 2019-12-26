package workbook.pg25exam6;

public class Test05 {
	public static void main(String[] args) {
		/*Student stu1 = new Student();
		stu1.setName("Kim");
		stu1.setKorean(100);
		stu1.setEnglish(90);
		stu1.setMath(95);
		stu1.setScience(89);
		Student stu2 = new Student();
		stu2.setName("Lee");
		stu2.setKorean(60);
		stu2.setEnglish(70);
		stu2.setMath(99);
		stu2.setScience(98);		
		Student stu3 = new Student();
		stu3.setName("Park");
		stu3.setKorean(68);
		stu3.setEnglish(86);
		stu3.setMath(60);
		stu3.setScience(40);
		
		System.out.println(stu1.getName()+" Æò±Õ:" +stu1.getAvg()+" ÇÐÁ¡: "+stu1.getGrade());
		System.out.println(stu2.getName()+" Æò±Õ:" +stu2.getAvg()+" ÇÐÁ¡: "+stu2.getGrade());
		System.out.println(stu3.getName()+" Æò±Õ:" +stu3.getAvg()+" ÇÐÁ¡: "+stu3.getGrade());*/
		
		Student[] stu = new Student[3];
		for(int i=0;i<stu.length;i++) {
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
		/*
		System.out.println(stu[0].getName()+" Æò±Õ:" +stu[0].getAvg()+" ÇÐÁ¡: "+stu[0].getGrade());
		System.out.println(stu[1].getName()+" Æò±Õ:" +stu[1].getAvg()+" ÇÐÁ¡: "+stu[1].getGrade());
		System.out.println(stu[2].getName()+" Æò±Õ:" +stu[2].getAvg()+" ÇÐÁ¡: "+stu[2].getGrade());
		*/
		
		stu[0].print();
		stu[1].print();
		stu[2].print();
	}

}
