package application;

public class App implements Runnable {
	
	private String name = "Mickey Mouse";

	public static void main(String[] args) {
		new App().start();

	}
	
	public void start() {
		//anonymous class
		Runnable runner1 = new Runnable() {
			public void run() {
				System.out.println("1 " + name);
			}
		};
		activate(runner1);
		
		//non static inner class
		Runner2 runner2 = new Runner2();
		activate(runner2);
		
		//static inner class
		Person person = new Person(name);
		Person.Display showName = person.new Display();
		activate(showName);
		
		//implement Runnable in main class
		activate(this);
		
		//method local inner class
		class Runner3 implements Runnable {
			public void run() {
				System.out.println("5 " + name);
			}
		}
		activate(new Runner3());
	}

	
	public void activate(Runnable runnable) {
		runnable.run();
	}
	
	public class Runner2 implements Runnable {
		public void run() {
			System.out.println("2 " + name);
		}
	}
	
	public void run() {
		System.out.println("4 " + name);
	}

}
