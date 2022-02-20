package application;

public class App {
	
	private String name = "Mickey Mouse";

	public static void main(String[] args) {
		new App().start();

	}
	
	public void start() {
		Runnable runner1 = new Runnable() {
			public void run() {
				System.out.println("1 " + name);
			}
		};
		activate(runner1);
		
		Runner2 runner2 = new Runner2();
		activate(runner2);
		
		Person person = new Person(name);
		Person.Display showName = person.new Display();
		activate(showName);
	}
	
	public void activate(Runnable runnable) {
		runnable.run();
	}
	
	public class Runner2 implements Runnable {
		public void run() {
			System.out.println("2 " + name);
		}
	}

}
