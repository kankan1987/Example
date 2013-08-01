package com.design.adaptee;

/**
 * 适配器模式 普通类
 * @author kk
 *
 */
public class ForwordPlays extends Play {

	public ForwordPlays(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋" + this.name + "进攻！");
	}

	@Override
	public void defense() {
		System.out.println("前锋" + this.name + "防守！");
	}

}
