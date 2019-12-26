package chap07.oop;
/*[Dessert 클래스]
- productName(상품명), price(금액), count(수량)의 멤버 변수가 정의되어 있어야 한다.
- 기본 생성자, 매개변수 초기화를 담당하는 생성자를 정의합니다.
getTotalPrice		금액을 계산하는 메소드
					단가*금액
print				제목을 출력하는 메소드
printProductInfo	상품의 정보를 출력하는 메소드
*/
public class Dessert {
	private String productName;
	private int price;
	private int count;
	public Dessert() {
	}
	public Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}
	
	public int getTotalPrice() {
		return price*count;
	}
	public static void print() {
		System.out.println("=================================");
		System.out.println("주문항목\t가격\t수량");
		System.out.println("=================================");
	}
	public void printProductInfo() {
		System.out.println(getProductName()+"\t"+getPrice()+"\t"+getCount());
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
