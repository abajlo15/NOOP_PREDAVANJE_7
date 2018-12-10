package Primjer1;


public class App {

	public static void main(String[] args) {

		Robot123 robi = new Robot123("Venci");
		Runnable job = new ThreadJob();
		Thread thr1 = new Thread(job);
		Thread thr = new Thread(job);
		thr.setName("Thread one....");
		thr1.setName("Thread two.....");

		System.out.println("******************* Before in main **************************");
		robi.description();

		thr.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thr1.start();
		try {
			Thread.currentThread().sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("************************* After in main ****************");
		System.out.println("Line after starting threads....");
		System.out.println("Final line in main thread....");
	}

}
