package com.design.proxy;

public class ProxyTest {
	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl("��С��");
		Proxy proxy = new Proxy(mm);
		proxy.GiveChocolate();
		proxy.GiveDolls();
		proxy.GiveFlowers();
	}
}
