package workbook.pg60exam5;

public class Otab extends Mobile{
	public Otab() {
	}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}
	public int operate(int time) {
		if(getBatterySize()>=time*12) {
			setBatterySize(getBatterySize()-time*12);
		}
		else {
			setBatterySize(0);
		}
		return getBatterySize();
	}
	public int charge(int time) {
		if((getBatterySize()+time*8)<=10000) { //full value 10000
			setBatterySize(getBatterySize()+time*8);
		}else if(getBatterySize()+time*8>10000) {
			setBatterySize(10000);
		}
		return getBatterySize();
	}
}
