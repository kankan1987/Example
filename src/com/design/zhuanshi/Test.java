package com.design.zhuanshi;

public class Test {
	public static void main(String[] args) {
		Person p = new Person("С��");
		BigTrouser bt = new BigTrouser();
		Trousers ts = new Trousers();
		Tshirt tsh = new Tshirt();
		
		System.out.println("��һ��װ�磺");
		bt.setComponent(p);
		ts.setComponent(bt);
		tsh.setComponent(ts);
		tsh.show();
	}
}
