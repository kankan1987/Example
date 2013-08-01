package com.threadpool;

public class WorkOne implements Runnable {
	
	static int count=1;
	@Override
	public void run() {
		System.out.println("执行工作任务一的人数为:" + count++ );
	}

}
