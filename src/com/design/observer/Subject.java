package com.design.observer;

/**
 * 观察者模式 被观察者
 * @author kk
 *
 */
interface Subject {
	void attach(Observer observer);
	void detach(Observer observer);
	void notifys();
	
    String getSubjectState();
	void setSubjectState(String action);
}
