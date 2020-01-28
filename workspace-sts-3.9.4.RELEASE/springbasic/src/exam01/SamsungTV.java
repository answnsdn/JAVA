package exam01;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---Àü¿ø ÄÒ´Ù.");
	
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---Àü¿ø ²ö´Ù.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---º¼·ıÀ» ³ôÀÎ´Ù.");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---ºÒ·ıÀ» ³·Ãá´Ù.");
	}

}
