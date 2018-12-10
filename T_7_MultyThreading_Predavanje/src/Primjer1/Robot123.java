package Primjer1;

import java.util.concurrent.ThreadLocalRandom;

public class Robot123 {
	
	private String name;
	private int id;
	
	public Robot123(String name) {
	
		this.name = name;
		id = ThreadLocalRandom.current().nextInt(0,100);
		
	}
	
	public void description() {
		
		System.out.println("Name: "+ name +"\nId: "+id);
		
	}
}
