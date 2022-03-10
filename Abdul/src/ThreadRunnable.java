
public class ThreadRunnable implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello World!!!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		ThreadRunnable tr=new ThreadRunnable();
		Thread t=new Thread(tr);
		t.start();
		t.start();
		t.wait();
	}

	
}
