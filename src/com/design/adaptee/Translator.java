package com.design.adaptee;

/**
 * ������ģʽ �м�������
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
