package com.design.adaptee;

/**
 * 适配器模式 中间适配器
 * @author kk
 *
 */
public class Translator extends Play {
	
    ForeignCenterPlay foreignCenterPlay = new ForeignCenterPlay();
	public Translator(String name) {
		super(name);
		this.foreignCenterPlay.setName(name);
	}

	@Override
	public void attack() {
		this.foreignCenterPlay.attach();
	}

	@Override
	public void defense() {
		this.foreignCenterPlay.defense();
	}

}
