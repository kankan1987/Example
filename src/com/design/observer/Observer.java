package com.design.observer;

/**
 *  观察者模式，观察者
 * @author kk
 *
 */
abstract class Observer {
	protected String name;
	protected Subject subject;
	
	public Observer(String name, Subject subject){
		this.name = name;
		this.subject = subject;
	}
	
	public abstract void upDate();
}
