package chap03;
//비교연산자 - ||, &&
public class OprTest04_Short {
	public static void main(String[] args) {
		int num = 100;
		String str = null;//현재 str은 아무것도 저장되지 않은 변수
		//str.length();
		System.out.println(num>=100 || str.length()>10);
		//System.out.println(num>=100 | str.length()>10);
		//&&연산자는 앞에가 false면 뒤에 확인 X
		//||연산자는 앞에가 true면 뒤에 확인 X
		
		System.out.println(num<100 && str.length()>10);
		System.out.println(num<100 & str.length()>10);
	}

}
