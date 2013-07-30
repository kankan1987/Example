package com.design.product;
/**
 * 建造模式 产品设计
 * @author kk
 *
 */
public class Director {
	public void Construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
}
