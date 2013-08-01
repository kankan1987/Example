package com.design.abstractfactory;

public class TestAbstractFactory {
	public static void main(String[] args) {
		ProductFactory productFactory = new ProductCreate();
		Product productA = productFactory.createProductA();
		Product productB = productFactory.createProductB();
		productA.insertName();
	}
}
