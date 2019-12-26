package chap04;
//continue - 선언된 위치 아래의 코드를 skip하기 위해 사용
public class GuGu_Continue {
	public static void main(String[] args) {
		for(int dan=2;dan<=9;dan++) {
			if(dan==5) {
				continue;
			}
			for(int j=1;j<=9;j++) {
				/*if(dan==5) {	break문이 내부 for에 선언되어 있으므로
					break;		반복문이 종료되지 않는다
				}*/
				System.out.print(dan+" * "+j+" = "+dan*j+"\t");
			}
			System.out.println();
		}
	}

}
