package com.design.zhuanshi;

/**
 * 装饰动作
 * @author kk
 *
 */
public class Finery extends Person {
	protected Person component;
	
	//装饰动作
	public void setComponent(Person component) {
		this.component = component;
	}
	
	public void show(){
		if(component != null){
			component.show();
		}
	}
}
