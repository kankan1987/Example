package com.design.adaptee;
/**
 * ������ģʽ
 * @author kk
 *
 */
public class TestAdaptee {
	public static void main(String[] args) {
		Play a = new ForwordPlays("�͵ٶ�");
		Play b = new CenterPlay("��˸��׵�");
		Play c = new GuardPlay("ɵñ");
		Play d = new Translator("Ҧ��");
		
		a.attack();
		b.defense();
		c.attack();
		d.attack();
		d.defense();
	}
}
