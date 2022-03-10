package com.demo;

public class RunableDemo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("ThreadExample.run() pARENT"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	RunableDemo demo = new RunableDemo();
	Thread thread= new Thread(demo);
	thread.start();
	/*for (int i = 0; i < 10; i++) {
		System.out.println("ThreadExample.run() pARENT"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
}
