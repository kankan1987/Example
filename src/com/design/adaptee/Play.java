package com.design.adaptee;
/**
 * 适配器模式 被适配的抽象类
 * @author kk
 *
 */
abstract class Play {
	String name;
	
	public Play(String name){
		this.name = name;
	}
	
	public abstract void attack();
	public abstract void defense();
}
