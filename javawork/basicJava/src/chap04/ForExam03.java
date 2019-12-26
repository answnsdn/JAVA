package chap04;
public class ForExam03 {
	public static void main(String[] args) {
		int all = 0;
		int hol = 0;
		int jak = 0;
		for(int i=1;i<101;i++) {
			all += i;
			if(i%2==0) {
				jak += i;
			}else {
				hol += i;
			}
		}
		System.out.println("Че:"+all);
		System.out.println("ШІМіЧе:"+hol);
		System.out.println("ТІМіЧе:"+jak);
	}

}
