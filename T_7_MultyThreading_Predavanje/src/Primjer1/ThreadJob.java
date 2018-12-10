package Primjer1;


public class ThreadJob implements Runnable {

	@Override
	public void run() {

		for (int k = 1; k < 10; k++) {
			System.out.println("Running thread : " + Thread.currentThread().getName());
		}

	}

}
