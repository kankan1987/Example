package com.design.zhuanshi;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("小样");
		BigTrouser bt = new BigTrouser();
		Trousers ts = new Trousers();
		Tshirt tsh = new Tshirt();
		
		System.out.println("第一种装扮：");
		bt.setComponent(p);
		ts.setComponent(bt);
		tsh.setComponent(ts);
		tsh.show();
	}
}
