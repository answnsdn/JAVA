package chap07.oop;

public class StudentTest {
	public static void main(String[] args) {
		Student[] stu = new Student[3];
		stu[0] = new Student("Kim",20, 100, 90, 95, 89);
		stu[1] = new Student("Lee",54, 60, 70, 99, 98);
		stu[2] = new Student("Park",9, 68, 86, 60, 40);
		for(int i=0;i<stu.length;i++) {
			stu[i].print();
		}
		
		Teacher t1 = new Teacher("장동건",45,"Spring");
		t1.print();
		
		Staff s1 = new Staff("가가가",51,"sdgasd");
		s1.print();
	}

}
