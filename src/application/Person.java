package application;

public class Person {
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	public class Display implements Runnable {
		public void run() {
			System.out.println("3 " + name);
		}
	}
}
