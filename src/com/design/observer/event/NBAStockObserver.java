package com.design.observer.event;
/**
 * 委托机制
 * @author kk
 *
 */
public class NBAStockObserver {
	private String name;
	private Subject subject;
	
	public NBAStockObserver(String name, Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public void closeNBADirectSeeding(){
		System.out.println(this.name+","+
				subject.getSubjectStatue()+",赶紧关了NBA直播，继续工作！");
	}
}
