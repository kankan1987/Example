package com.design.adaptee;
/**
 * ������ģʽ ������ĳ�����
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
