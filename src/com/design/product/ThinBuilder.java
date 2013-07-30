package com.design.product;
/**
 * ����ģʽ ����ʵ������
 * @author kk
 *
 */
public class ThinBuilder extends Builder{
	
	Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("����A");
	}

	@Override
	public void buildPartB() {
		product.addPart("����B");
	}

	@Override
	public void buildPartC() {
		product.addPart("����C");
	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
