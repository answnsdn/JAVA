package chap07.oop.poly;
/*[Content클래스]
1. 변수   title(String), price(int)   
2. 생성자   기본생성자    title 을 매개변수로 받는 생성자  
3. 메소드   
    - void totalPrice()라는 abstract메소드  
    - setter/getter 메소드 : title, price 변수  
    - show()      
      =>“title 비디오의 가격은 price 원 입니다.”라고 출력하는 메소드      
          예) 이끼비디오의 가격은 2000원 입니다.  
*/
public abstract class Content {
	private String title;
	private int price;
	public Content() {
	}
	public Content(String title) {
		super();
		this.title = title;
	}
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(title+" 비디오의 가격은 "+price+"원 입니다.");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
