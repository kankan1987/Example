package com.threadpool;

public class WorkOne implements Runnable {
	
	static int count=1;
	@Override
	public void run() {
		System.out.println("ִ�й�������һ������Ϊ:" + count++ );
	}

}
