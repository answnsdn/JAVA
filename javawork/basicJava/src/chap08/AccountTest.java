package chap08;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		account.setAccount("441-0290-1203");
		account.setBalance(500000);
		account.setInterestRate(7.3);
		System.out.println("계좌정보:"+account.getAccount()
					+" 현재잔액:"+account.getBalance());
		try {
			account.deposit(-10);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			account.withdraw(600000);
		}catch(Exception e) {
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}
		System.out.println("이자:"+account.calculateInterest());
	}
}









