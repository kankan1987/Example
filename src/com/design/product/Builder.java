package com.design.product;
/**
 * 建造模式建造者
 * @author kk
 *
 */
abstract class Builder {
	public abstract void buildPartA();
	public abstract void buildPartB();
	public abstract void buildPartC();
	public abstract Product GetResult(); 
}
