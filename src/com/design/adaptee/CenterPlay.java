package com.design.adaptee;

public class CenterPlay extends Play {

	public CenterPlay(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("�з�" + this.name + "������");
	}

	@Override
	public void defense() {
		System.out.println("�з�" + this.name + "���أ�");
	}

}
