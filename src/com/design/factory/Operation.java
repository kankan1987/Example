package com.design.factory;
/**
 * 运算方法的抽象
 * @author kk
 *
 */
public abstract class Operation {
	private int numberA;
	private int numberB;
	
	public int getNumberA() {
		return numberA;
	}
	public int getNumberB() {
		return numberB;
	}
	public void setNumberA(int numberA) {
		this.numberA = numberA;
	}
	
	public void setNumberB(int numberB) {
		this.numberB = numberB;
	}
	
	public abstract int getResult();
}
