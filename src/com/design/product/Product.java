package com.design.product;

import java.util.ArrayList;
import java.util.List;
/**
 * ������ģʽ ��Ʒ��Ϣ
 * @author kk
 *
 */
public class Product {
	private List<String> parts = new ArrayList<String>();
	
	public void addPart(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("��Ʒ���������:");
		for(String m:parts){
			System.out.print(m+"��");
		}
	}
}
