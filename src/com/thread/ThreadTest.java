package com.thread;

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		new MyThread(1).start();
		new MyThread(2).start();
		new MyThread(3).start();
		new MyThread(4).start();
		
		MyRunnable myRunnable1 = new MyRunnable(1);
		MyRunnable myRunnable2 = new MyRunnable(2);
		MyRunnable myRunnable3 = new MyRunnable(3);
		MyRunnable myRunnable4 = new MyRunnable(4);
		new Thread(myRunnable1).start();
		new Thread(myRunnable2).start();
		new Thread(myRunnable3).start();
		new Thread(myRunnable4).start();
		
		//获取当前线程
		Thread threadnow = Thread.currentThread();
		System.out.println("当前线程名称:"+threadnow.getName());
		threadnow.interrupt();
		//获取线程优先级
		System.out.println("当前线程优先级:"+threadnow.getPriority());
		//设置线程优先级别
		threadnow.setPriority(10);
		//threadnow.setDaemon(true);
		threadnow.join();
	}
	
	public static class MyThread extends Thread{
		private int count;
		
		public MyThread(int count) {
			this.count = count;
		}
		
		@Override
		public void run() {
			System.out.println("Thread输出："+this.count);
		}
	}
	
	public static class MyRunnable implements Runnable{
		private int count;
		
		public MyRunnable(int count) {
			this.count = count;
		}
		@Override
		public void run() {
			for(int i = 0;i < 10;i++){
				System.out.println("Runnable输出:" + this.count);
			}
		}
		
	}
}
