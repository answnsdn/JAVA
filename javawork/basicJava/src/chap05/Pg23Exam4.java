package chap05;

import java.util.Random;

public class Pg23Exam4 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		Random rand = new Random();
		int sum = 0;
		int num = 0;
		float avg = 0;
		for(int i=0;i<arr3.length;i++) {
			num = rand.nextInt(10)+1; // 랜덤변수 생성
			for(int j=0;j<i;j++) { // 중복 탐색
				if(num==arr3[j]) { // 중복일경우
					num = rand.nextInt(10)+1; //랜덤변수 재생성
					j=-1; // 중복탐색 처음부터 다시 
				}
			}			
			arr3[i] = num;
			sum += arr3[i];
		}
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		avg = (float)sum/arr3.length;
		System.out.println();
		System.out.println("sum="+sum);
		System.out.println("avg="+avg);
	}
}
