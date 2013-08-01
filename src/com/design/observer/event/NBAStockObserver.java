package com.design.observer.event;
/**
 * ί�л���
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
				subject.getSubjectStatue()+",�Ͻ�����NBAֱ��������������");
	}
}
