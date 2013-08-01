package com.design.observer;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject subject) {
		super(name, subject);
	}

	@Override
	public void upDate() {
		System.out.println(subject.getSubjectState()+
				","+this.name+"��Ҫ���������ˣ���������!");
	}

}
