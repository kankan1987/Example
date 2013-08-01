package com.design.adaptee;

/**
 * 适配器模式 普通类
 * @author kk
 *
 */
public class GuardPlay extends Play {

	public GuardPlay(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("后卫" + this.name + "进攻！");
	}

	@Override
	public void defense() {
		System.out.println("后卫" + this.name + "进攻！");
	}

}
