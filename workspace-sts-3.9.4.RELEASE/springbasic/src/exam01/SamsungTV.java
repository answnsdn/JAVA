package exam01;

public class SamsungTV implements TV {

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� �Ҵ�.");
	
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---���� ����.");
	}

	@Override
	public void soundUp() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---������ ���δ�.");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTV---�ҷ��� �����.");
	}

}
