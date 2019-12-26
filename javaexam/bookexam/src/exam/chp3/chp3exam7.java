package exam.chp3;

public class chp3exam7 {
	public static void main(String[] args) {
		int fahrenheit = 100;
		float celcius = (int)(100*(fahrenheit-32)*5/9F)/100F;
		//반올림 메소드 없이 구현하다보니 뒷자리를 잘랐습니다.		
		System.out.println("Fahrenheit:"+fahrenheit);
		System.out.println("Celcius:"+celcius);
	}

}
