package com.design.product;
/**
 * 建造模式 建造实现胖子
 * @author kk
 *
 */
public class FatBuilder extends Builder{
	
	Product product = new Product();
	@Override
	public void buildPartA() {
		product.addPart("部件A-A");
	}

	@Override
	public void buildPartB() {
		product.addPart("部件B-B");
	}

	@Override
	public void buildPartC() {
		product.addPart("部件C-C");
	}

	@Override
	public Product GetResult() {
		// TODO Auto-generated method stub
		return product;
	}
}
