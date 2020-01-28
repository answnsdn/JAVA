package exam01;

public class TVUser {
	public static void main(String[] args) {
		TV lg = new LgTV();
		lg.powerOn();
		lg.soundUp();
		lg.soundDown();
		lg.powerOff();
		
		TV samsung = new SamsungTV();
		samsung.powerOn();
		samsung.soundUp();
		samsung.soundDown();
		samsung.powerOff();
	}

}
