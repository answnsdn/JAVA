package workbook.pg47exam5;

public class Account {
	private String account;
	private int balance;
	private String ownerName;
	private double interestRate;
	public Account() {
	}
	public Account(String account, int balance, String ownerName, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.ownerName = ownerName;
		this.interestRate = interestRate;
	}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccount() {
		return this.account;
	}
	public int getBalance() {
		return this.balance;
	}
	
	public double calculateInterest() {
		return (double)(this.balance)*this.interestRate/100;
	}
	public void deposit(int money) {
		this.balance += money;
	}
	public void withdraw(int money) {
		this.balance -= money;
	}
	////////////////////////////////////////////////////
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
		
	public void print() {
		System.out.println("°èÁÂÁ¤º¸: "+ getAccount()+" ÇöÀçÀÜ¾×: "+ getBalance());
	}
	
}
