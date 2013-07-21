package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");
		list.add("e");
		list.add("d");
		list.add("f");
		list.add("c");
		list.add("b");
//		for(Object s:list){
//			System.out.println("���:"+s.toString());
//		}
		outPut("   δ����",list);
		//����������
		Collections.sort(list);
//		for(Object s:list){
//			System.out.println("�����:"+s.toString());
//		}
		outPut("    �����",list);
		//��ת����
		Collections.reverse(list);
		outPut("��ת����",list);
		
		//��������
		Collections.shuffle(list);
		outPut("��������",list);
		String max_s = Collections.max(list);
		String min_s = Collections.min(list);
		System.out.println("max ="+ max_s);
		System.out.println("min ="+ min_s);
		
		//�滻��
		Collections.fill(list, 1);
		outPut("�滻����:",list);
		//Collections.copy(arg0, arg1) //arg0���Ƶ�arg1
		
		
		
	}
	
	public static void outPut(String s,Collection object){
		System.out.print(s + ":   ");
		for(Object o:object){
			System.out.print(" " + o.toString());
		}
		System.out.println("");
	}
	
	
}
