package com.design.zhuanshi;

/**
 * װ�ζ���
 * @author kk
 *
 */
public class Finery extends Person {
	protected Person component;
	
	//װ�ζ���
	public void setComponent(Person component) {
		this.component = component;
	}
	
	public void show(){
		if(component != null){
			component.show();
		}
	}
}
