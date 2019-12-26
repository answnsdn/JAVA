package chap08;

public class Calulator {
	public double divide(int a,int b) {
		double result = 0.0;
		try {
			result = a/b;
		}catch(Exception e) {
			System.out.println("Exception이 발생하였습니다. 다시 입력해 주세요.");
		}
		return result;
	}
}
