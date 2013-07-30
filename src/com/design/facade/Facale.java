package com.design.facade;

/**
 * 门面模式
 * 将子系统的模块暴露给其他系统调用
 * @author kk
 *
 */
public class Facale {
	SubSystemOne subSystemOne;
	SubSystemTwo subSystemTwo;
	SubSystemThree subSystemThree;
	
	public Facale(){
		subSystemOne = new SubSystemOne();
		subSystemTwo = new SubSystemTwo();
		subSystemThree = new SubSystemThree();
	}
	
	public void methodA(){
		subSystemOne.methodOne();
		subSystemTwo.methodTwo();
	}
	
	public void methodB(){
		subSystemThree.methodThree();
	}
}
