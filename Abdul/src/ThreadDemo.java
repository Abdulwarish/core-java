
public class ThreadDemo extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		t1.start();
	}

}
