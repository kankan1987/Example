package com.design.observer;

public class TestObserver {
	public static void main(String[] args) {
		Boss kk = new Boss();
		StockObserver xiaoli = new StockObserver("小李", kk);
		StockObserver xiaowang = new StockObserver("小王",kk);
		
		kk.attach(xiaoli);
		kk.attach(xiaowang);
		kk.setSubjectState("老子又回来了");
		kk.notifys();
	}
}
