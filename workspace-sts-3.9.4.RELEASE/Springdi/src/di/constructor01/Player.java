package di.constructor01;

//Player가 갖고 있는 Dice를 외부에서(스프링컨테이너) Injection받아 사용해야하므로 Injection 받을 수 있도록 준비
//=> Constructor or Setter메소드 만들기
public class Player implements AbstractPlayer  {
	AbstractDice d;
	int totalValue = 0;
	
	public void play(){
		
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	
	
	public int getTotalValue(){
		return totalValue;
	}

	public Player(AbstractDice d) {
		super();
		this.d = d;
	}

}