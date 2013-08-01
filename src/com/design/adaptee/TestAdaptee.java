package com.design.adaptee;
/**
 * ÊÊÅäÆ÷Ä£Ê½
 * @author kk
 *
 */
public class TestAdaptee {
	public static void main(String[] args) {
		Play a = new ForwordPlays("°ÍµÙ¶û");
		Play b = new CenterPlay("Âó¿Ë¸ñÀ×µÏ");
		Play c = new GuardPlay("ÉµÃ±");
		Play d = new Translator("Ò¦Ã÷");
		
		a.attack();
		b.defense();
		c.attack();
		d.attack();
		d.defense();
	}
}
