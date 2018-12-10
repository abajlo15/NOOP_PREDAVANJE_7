package Primjer2;

public class CompanyAddOn implements Runnable {

	BankAccount acc;
	int amount = 0;

	public CompanyAddOn(BankAccount acc, int amount) {

		this.acc = acc;
		this.amount = amount;

	}

	public void run() {

		addOn();

	}

	public synchronized void addOn() {

		int amnt = (1 / 5) * (amount);
		acc.addToAcc(amnt);
		System.out.println(Thread.currentThread().getName() + " Added money to account: " + amnt);
		System.out.println("\n**********************************************\n");

	}

}
