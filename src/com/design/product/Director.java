package com.design.product;
/**
 * ����ģʽ ��Ʒ���
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
