package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifys() {
		for(Observer o:observers){
			o.upDate();
		}
	}



	@Override
	public void setSubjectState(String action) {
		this.action = action;
	}

	@Override
	public String getSubjectState() {
		return this.action;
	}

}
