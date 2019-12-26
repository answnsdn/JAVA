package chap07.oop;
/*- Dessert 클래스를 상속받는다.
- 칼로리를 나타내는 멤버 변수를 정의합니다.(calorie)
- 기본 생성자와 값을 초기화하는 생성자를 정의합니다.
*/

public class IceCream extends Dessert{
	private int calorie;
	public IceCream(){
	}
	/*public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}*/
	public IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}//super constructor
	
	public static void print() {
		System.out.println("=====================================");
		System.out.println("주문항목\t가격\t수량\t칼로리");
		System.out.println("=====================================");
	}
	
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount()+"\t"+calorie+"kcal");
	}
}
