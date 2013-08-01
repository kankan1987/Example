package com.design.observer.event;
/**
 * 委托机制
 * @author kk
 *
 */
public class StockObserver {
	private String name;
	private Subject subject;
	
	public StockObserver(String name, Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void closeMark(){
		System.out.println(this.name+","+
				subject.getSubjectStatue()+",赶紧关了行情，继续工作！");
	}
}
