package chap07.oop.poly;

public class Coffee extends Beverage{
	static int amount;
	public Coffee() {
	}
	public Coffee(String name) {
		super(name);
		amount++;
		calcPrice();
	}

	public void calcPrice() {
		if(getName().equals("Americano")) {
			setPrice(1500);
		}else if(getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}
}
