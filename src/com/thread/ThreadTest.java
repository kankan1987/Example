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
		
		//��ȡ��ǰ�߳�
		Thread threadnow = Thread.currentThread();
		System.out.println("��ǰ�߳�����:"+threadnow.getName());
		threadnow.interrupt();
		//��ȡ�߳����ȼ�
		System.out.println("��ǰ�߳����ȼ�:"+threadnow.getPriority());
		//�����߳����ȼ���
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
			System.out.println("Thread�����"+this.count);
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
				System.out.println("Runnable���:" + this.count);
			}
		}
		
	}
}
