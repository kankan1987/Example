package com.design.observer.event;

import java.beans.EventHandler;
/**
 *  �¼�ί�л���
 *  ���۲��ߵķ�������ί��
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
