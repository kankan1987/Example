package com.design.adaptee;

/**
 * ������ģʽ ��ͨ��
 * @author kk
 *
 */
public class GuardPlay extends Play {

	public GuardPlay(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("����" + this.name + "������");
	}

	@Override
	public void defense() {
		System.out.println("����" + this.name + "������");
	}

}
