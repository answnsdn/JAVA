package chap05;

public class Pg14Exam07 {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int sum = 0;
		System.out.println("ÀÔ·Â ¿¹1:"+num);
		for(int i=1;i<=100;i++) {
			if(i%num==0) {
				if(sum!=0) {
					System.out.print("+"+i);
				}else {
					System.out.print(i);
				}
				sum += i;
			}
		}
		System.out.println("="+sum);
	}

}
