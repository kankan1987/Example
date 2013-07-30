package com.design.product;
/**
 * ����ģʽ ����ʵ������
 * @author kk
 *
 */
public class FatBuilder extends Builder{
	
	Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("����A-A");
	}

	@Override
	public void buildPartB() {
		product.addPart("����B-B");
	}

	@Override
	public void buildPartC() {
		product.addPart("����C-C");
	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
