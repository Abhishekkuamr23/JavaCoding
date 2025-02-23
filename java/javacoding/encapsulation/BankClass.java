package javacoding.encapsulation;

public class BankClass {
	private double bankAccount;
	private double balance;
	private double withdrawal;
	
	public BankClass(double bankAccount, double amount) {
		this.bankAccount = bankAccount;
		if(amount>0) {
			this.balance = amount;
		}
		else {
			System.out.println("Enter valid amount");
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Your total Balance : " + balance);
		
	}
	
	public void withdrawal(double withdrawal) {
		if(withdrawal>0 && balance>withdrawal) {
			balance -= withdrawal;
			System.out.println("Now you have total Balance : " + balance);
		}
		else {
			System.out.println("Enter valid amount");
		}
		
	}
}
