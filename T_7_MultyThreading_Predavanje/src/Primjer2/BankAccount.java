package Primjer2;

public class BankAccount {

	private double balance;

	public BankAccount(double blnc) {
		this.balance = blnc;
	}

	public double getBalance() {

		return balance;

	}

	public void withdrawFromAcc(double amnt) {
		balance = balance - amnt;
	}
	
	public void addToAcc(double amnt) {
		balance = balance + amnt;
	}

}