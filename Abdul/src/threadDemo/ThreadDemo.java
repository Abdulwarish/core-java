package threadDemo;

class Run extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Run...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}

class Go extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Go...");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		Run obj1 = new Run();
		Go obj2 = new Go();
		
		obj1.start();
		try {Thread.sleep(10);} catch (Exception e) {}
		obj2.start();
	}

}
