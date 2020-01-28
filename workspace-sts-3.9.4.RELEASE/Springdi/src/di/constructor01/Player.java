package di.constructor01;

//Player�� ���� �ִ� Dice�� �ܺο���(�����������̳�) Injection�޾� ����ؾ��ϹǷ� Injection ���� �� �ֵ��� �غ�
//=> Constructor or Setter�޼ҵ� �����
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