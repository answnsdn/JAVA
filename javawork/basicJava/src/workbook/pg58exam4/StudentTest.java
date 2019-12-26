package workbook.pg58exam4;
public class StudentTest {

	public static void main(String[] args) {
		double avgage = 0.0;
		double avghei = 0.0;
		double avgwei = 0.0;
		Student[] student = new Student[3];
		student[0] = new Student("È«±æµ¿",15,171,81);
		student[1] = new Student("ÇÑ»ç¶÷",13,183,72);
		student[2] = new Student("ÀÓ°ÆÁ¤",16,175,65);
		for(int i=0;i<student.length;i++) {
			if(i==0) {
				System.out.println("ÀÌ¸§\t³ªÀÌ\t½ÅÀå\t¸ö¹«°Ô");
			}
			avgage += student[i].getAge();
			avghei += student[i].getHeight();
			avgwei += student[i].getWeight();
			System.out.println(student[i].getName()+"\t"+student[i].getAge()+"\t"+student[i].getHeight()+"\t"+student[i].getWeight());
		}
		avgage /= student.length;
		avghei /= student.length;
		avgwei /= student.length;
		System.out.println("³ªÀÌÀÇ Æò±Õ: "+ Math.round(avgage));
		System.out.println("½ÅÀåÀÇ Æò±Õ: "+ Math.round(avghei));
		System.out.println("¸ö¹«°ÔÀÇ Æò±Õ: "+ Math.round(avgwei));
	}

}
