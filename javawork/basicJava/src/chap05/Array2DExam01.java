package chap05;

public class Array2DExam01 {

	public static void main(String[] args) {
		int[][] myArr = new int[5][5];
		int[][] myArr2 = new int[5][5];
		
		for(int outer=0;outer<myArr.length;outer++) {
			for(int i=0;i<myArr[outer].length;i++) {
				myArr[outer][i] = 5*outer + i + 1;
			}
		}
		for(int outer=0;outer<myArr2.length;outer++) {
			for(int i=0;i<myArr2[outer].length;i++) {
				if(outer==i) {
					myArr2[outer][i] = '*';
					continue;
				}
				myArr2[outer][i] = 5*outer + i + 1;
			}
		}
		
		for(int outer=0;outer<myArr.length;outer++) {
			for(int i=0;i<myArr[outer].length;i++) {
				System.out.print(myArr[outer][i]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int outer=0;outer<myArr2.length;outer++) {
			for(int i=0;i<myArr2[outer].length;i++) {
				if(outer==i) {
					System.out.print((char)myArr2[outer][i]+"\t");
				} else {
				System.out.print(myArr2[outer][i]+"\t");
				}
			}
			System.out.println();
		}
	}
}
