package com.design.observer.event;

import java.beans.EventHandler;
/**
 *  事件委托机制
 *  将观察者的方法进行委托
 * @author kk
 *
 */
public class Boss implements Subject {
	
	public  EventHandler update;
	
	private String action;

	@Override
	public void notifys() {
		update.getTarget();
	}

	@Override
	public String getSubjectStatue() {
		return this.action;
	}

	@Override
	public void setSubjectStatue(String action) {
		this.action = action;
	}

}
