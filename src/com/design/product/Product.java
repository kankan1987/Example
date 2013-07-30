package com.design.product;

import java.util.ArrayList;
import java.util.List;
/**
 * 建造者模式 产品信息
 * @author kk
 *
 */
public class Product {
	private List<String> parts = new ArrayList<String>();
	
	public void addPart(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("产品包括的配件:");
		for(String m:parts){
			System.out.print(m+"、");
		}
	}
}
