package com.design.proxy;

/**
 * 代理追求类
 * @author kk
 *
 */
public class Proxy implements GiveGift {
	Pursuit pursuit;
	
	public Proxy(SchoolGirl mm){
		this.pursuit = new Pursuit(mm);
	}
	@Override
	public void GiveDolls() {
		pursuit.GiveDolls();
	}

	@Override
	public void GiveFlowers() {
		pursuit.GiveFlowers();
	}

	@Override
	public void GiveChocolate() {
		pursuit.GiveChocolate();
	}

}
