import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public  class DemoCheck extends Thread {
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		DemoCheck d=new DemoCheck();
		DER df=new DER();
		df.run();
		df.join();
		d.run();

	}
	
}
class DER extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hellojhhj");
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
}

