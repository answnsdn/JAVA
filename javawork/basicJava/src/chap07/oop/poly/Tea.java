package chap07.oop.poly;

public class Tea extends Beverage{
	static int amount;
	public Tea() {
	}
	public Tea(String name) {
		super(name);
		amount++;
		calcPrice();
	}

	public void calcPrice() {
		if(getName().equals("lemonTea")) {
			setPrice(1500);
		}else if(getName().equals("ginsengTea")) {
			setPrice(2000);
		}else if(getName().equals("redginsengTea")) {
			setPrice(2500);
		}
	}
}
