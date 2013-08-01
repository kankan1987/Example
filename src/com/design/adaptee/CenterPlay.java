package com.design.adaptee;

public class CenterPlay extends Play {

	public CenterPlay(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ÖĞ·æ" + this.name + "½ø¹¥£¡");
	}

	@Override
	public void defense() {
		System.out.println("ÖĞ·æ" + this.name + "·ÀÊØ£¡");
	}

}
