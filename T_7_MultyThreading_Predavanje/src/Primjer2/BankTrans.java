package Primjer2;

import java.util.concurrent.ThreadLocalRandom;

public class BankTrans implements Runnable {

	BankAccount acc;
	CompanyAddOn comp = new CompanyAddOn(acc, 10000);
	static int counter = 0;

	public BankTrans(BankAccount acc) {

		this.acc = acc;

	}

	public void run() {

		for (int i = 0; i <= 20; i++) {

			makeWithdrawal(ThreadLocalRandom.current().nextInt(50, 300));
			if (acc.getBalance() < 0) {
				System.out.println("Nmea vise para na racunu....");

			}
		}

	}

	private synchronized void makeWithdrawal(double amount) {

		if (acc.getBalance() >= amount) {
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw: " + amount);
			System.out.println(Thread.currentThread().getName() + " is redy to withdraw and withdraws: " + amount);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " --> woke up...");
			acc.withdrawFromAcc(amount);

			System.out.println(Thread.currentThread().getName() + " completes the withdrawal!!!");
			System.out.println("Remaining: " + acc.getBalance());
			System.out.println("\n**********************************************\n");
			counter++;
		} else if (amount >= acc.getBalance() & acc.getBalance() != 0) {
			System.out.println(Thread.currentThread().getName() + " Wants to withdraw: " + amount);
			System.out.println(Thread.currentThread().getName() + " can only withdraw: " + acc.getBalance());

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " --> woke up...");
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal of: " + acc.getBalance());
			System.out.println("\n**********************************************\n");
			acc.withdrawFromAcc(acc.getBalance());
			counter++;

		} else {
			System.out.println("Sorry, not enough money for " + Thread.currentThread().getName());
			counter++;
		}

		if (counter == 10) {

			comp.addOn();
			counter = 0;

		}
	}

}
