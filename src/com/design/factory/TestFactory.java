package com.design.factory;

public class TestFactory {
	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation op = operFactory.createOperation();
		op.setNumberA(2);
		op.setNumberB(5);
		System.out.println("½á¹û:"+op.getResult());
		
	}
}
