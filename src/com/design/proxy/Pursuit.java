package com.design.proxy;

/**
 * ��������
 * ׷����
 * @author kk
 *
 */
public class Pursuit implements GiveGift {
	SchoolGirl mm;
	public Pursuit(SchoolGirl mm){
		this.mm = mm;
	}
	@Override
	public void GiveDolls() {
		System.out.println(mm.getName() + "����������");
	}

	@Override
	public void GiveFlowers() {
		System.out.println(mm.getName() + "���㻨");
	}

	@Override
	public void GiveChocolate() {
		System.out.println(mm.getName() + "�����ɿ���");
	}

}
