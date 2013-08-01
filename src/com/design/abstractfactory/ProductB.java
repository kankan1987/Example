package com.design.abstractfactory;

public class ProductB extends AbstractProduct {
	public void insertName(){
		System.out.println("我通过oracle数据插入了姓名!");
	}
	
	public void insertAge(){
		System.out.println("我通过oracle数据插入了年龄!");
	}
}
