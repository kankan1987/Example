package com.design.facade;

/**
 * ����ģʽ
 * ����ϵͳ��ģ�鱩¶������ϵͳ����
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
