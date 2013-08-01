package com.design.adaptee;

/**
 * 适配器模式 普通类
 * @author kk
 *
 */
public class ForeignCenterPlay {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attach(){
		System.out.println("Center " + this.name + "attach !");
	}
	
	public void defense(){
		System.out.println("Center " + this.name + "defense !");
	}
}
