package com.design.observer;

/**
 * �۲���ģʽ ���۲���
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
