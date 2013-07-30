package com.design.product;

public class TestBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder1 = new FatBuilder();
		director.Construct(builder1);
		Product product = builder1.GetResult();
		product.show();
		
		Builder builder2 = new ThinBuilder();
		director.Construct(builder2);
		product = builder2.GetResult();
		product.show();
	}

}
