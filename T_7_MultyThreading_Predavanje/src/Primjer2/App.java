package Primjer2;

public class App {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(10000.00);
		BankTrans transaction = new BankTrans(account);
		CompanyAddOn company = new CompanyAddOn(account,10000);
		Thread entOne = new Thread(transaction);
		Thread entTwo = new Thread(transaction);
		Thread entThree = new Thread(company);

		entOne.setName("Muz");
		entTwo.setName("Zena");
		entThree.setName("Firma");

		entOne.start();
		entTwo.start();
		entThree.start();

	}

}
