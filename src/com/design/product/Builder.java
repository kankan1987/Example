package com.design.product;
/**
 * ����ģʽ������
 * @author kk
 *
 */
abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	public abstract Product GetResult(); 
}
