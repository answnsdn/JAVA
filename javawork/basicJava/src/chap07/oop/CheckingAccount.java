package chap07.oop;

public class CheckingAccount extends Account{
	private String cardNo;

	public CheckingAccount() {
	}
	public CheckingAccount(String account, String ownerName, int balance, String cardNo) {
		super(account, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public void pay(String cardNo, int amount) {
		//문자열 비교는 무조건 equals를 이용해서 비교한다.
		// '==' 사용  X
		if(this.cardNo.equals(cardNo)) {
			if(this.getBalance() >= amount) {
				this.withdraw(amount);
			}else {
				System.out.println("잔고가 부족합니다.");
			}
		}
		else {
			System.out.println("지불이 불가능합니다.");
		}
	}
}
