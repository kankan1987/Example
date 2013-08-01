package com.design.abstractfactory;

public class ProductA extends AbstractProduct {
	public void insertName(){
		System.out.println("我通过sql2005数据插入了姓名!");
	}
	public void insertAge(){
		System.out.println("我通过sql2005数据插入了年龄!");
	}
}
