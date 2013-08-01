package com.design.observer;

public class TestObserver {
	public static void main(String[] args) {
		Boss kk = new Boss();
		StockObserver xiaoli = new StockObserver("С��", kk);
		StockObserver xiaowang = new StockObserver("С��",kk);
		
		kk.attach(xiaoli);
		kk.attach(xiaowang);
		kk.setSubjectState("�����ֻ�����");
		kk.notifys();
	}
}
