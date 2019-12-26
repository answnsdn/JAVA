package workbook.pg60exam5;
public class Mobile {
	private	String mobileName;
	private int batterySize;
	private String osType;
	public Mobile() {
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	public int operate(int time) {
		if(batterySize>=time*10) {
			this.batterySize -= time*10;
		}
		else {
			batterySize = 0;
		}
		return batterySize;
	}
	public int charge(int time) {
		if((batterySize+time*10)<=5000) { // full value 5000
			this.batterySize += time*10;
		}else if(batterySize+time*10>5000) {
			batterySize = 5000;
		}
		return batterySize;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	public void print() {
		System.out.println(this.mobileName+"\t\t"+this.batterySize+"\t\t"+this.osType);
	}
}
