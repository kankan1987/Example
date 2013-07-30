package com.design.product;
/**
 * 建造模式 建造实现瘦子
 * @author kk
 *
 */
public class ThinBuilder extends Builder{
	
	Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("部件A");
	}

	@Override
	public void buildPartB() {
		product.addPart("部件B");
	}

	@Override
	public void buildPartC() {
		product.addPart("部件C");
	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
