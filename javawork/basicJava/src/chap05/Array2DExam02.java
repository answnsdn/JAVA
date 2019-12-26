package chap05;

public class Array2DExam02 {
//workbook pg21 exam2
	public static void main(String[] args) {
		int[][] arr2 = {
						{5,5,5,5,5},
						{10,10,10,10,10},
						{20,20,20,20,20},
						{30,30,30,30,30}
		};
		int sum = 0;
		int cnt = 0;
		float avg = 0;
		
		for(int outer=0;outer<arr2.length;outer++) {
			for(int i=0;i<arr2[outer].length;i++) {
				sum += arr2[outer][i];
				cnt++;
			}
		}
		avg = sum/(float)cnt;
		System.out.println("total="+sum);
		System.out.println("average="+avg);
	}

}
