package threadDemo;

import org.w3c.dom.css.Counter;

class Demo{
	int count;
	public synchronized void increament() {  // synchronized it stop the thread t2 until complete thread t1
		count++;
	}
}
public class ThreadDemo1 {

	public static void main(String[] args) throws InterruptedException {
		Demo obj=new Demo();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=500000;i++) {
					obj.increament();
				}
			}
		});
		
		Thread t2=new Thread(new Runnable() {
			public void run() {
				for(int i=1;i<=500000;i++) {
					obj.increament();
				}
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		System.out.println("Count="+obj.count);
	}

}
