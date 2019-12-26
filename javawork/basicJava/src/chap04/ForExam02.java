package chap04;

import java.util.Scanner;

public class ForExam02 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("´Ü:");
		int gugu = key.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(gugu+" * "+(i)+" = "+(gugu*i));
		}
	}

}
