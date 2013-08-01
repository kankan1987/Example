package com.design.abstractfactory;


public class ProductCreate  implements ProductFactory{

	@Override
	public Product createProductA() {
		// TODO Auto-generated method stub
		return new ProductA();
	}

	@Override
	public Product createProductB() {
		// TODO Auto-generated method stub
		return new ProductB();
	}

}
