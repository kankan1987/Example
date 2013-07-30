package com.design.zhuanshi;

/**
 * 装饰模式
 * 装饰核心
 * @author kk
 *
 */
public class Person {
	private String name;
	
	public Person(){
		
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println("装扮的"+name);
	}
}
