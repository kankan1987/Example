package com.design.adaptee;

/**
 * ������ģʽ ��ͨ��
 * @author kk
 *
 */
public class ForwordPlays extends Play {

	public ForwordPlays(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("ǰ��" + this.name + "������");
	}

	@Override
	public void defense() {
		System.out.println("ǰ��" + this.name + "���أ�");
	}

}
