package com.design.observer.event;
/**
 * ί�л���
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
				subject.getSubjectStatue()+",�Ͻ��������飬����������");
	}
}
