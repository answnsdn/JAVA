package chap04;

import java.util.Random;
//if문과 Random클래스
public class ifTest01 {
	public static void main(String[] args) {
		//Random의 nextInt를 이용해서 1부터 100까지 값을 발생시킨 후 작업
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		//int num = 90;
		if(num>=90) {
			System.out.println("만족");
			System.out.println("두 번째 문장");
		}
		System.out.println("종료");
	}

}
