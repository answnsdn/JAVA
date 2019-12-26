package test.exam;
public class TimeExam{
	public static void main(String[] args){
		//time변수에 저장된 값은 초 데이터이다.
		//___시 ____분 ____초   의 형태로 출력하기
		int time = 8888;
		int h = time/(60*60);
		int time2 = time%(60*60);
		int m =  time2/60;
		int s = time2%60;
		System.out.println(h+"시 " + m+"분 "+ s+"초");


	}
}