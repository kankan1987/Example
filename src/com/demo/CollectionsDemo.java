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
//			System.out.println("输出:"+s.toString());
//		}
		outPut("   未排序",list);
		//按增量排序
		Collections.sort(list);
//		for(Object s:list){
//			System.out.println("排序后:"+s.toString());
//		}
		outPut("    排序后",list);
		//反转排序
		Collections.reverse(list);
		outPut("反转排序",list);
		
		//混乱排序
		Collections.shuffle(list);
		outPut("混乱排序",list);
		String max_s = Collections.max(list);
		String min_s = Collections.min(list);
		System.out.println("max ="+ max_s);
		System.out.println("min ="+ min_s);
		
		//替换掉
		Collections.fill(list, 1);
		outPut("替换过后:",list);
		//Collections.copy(arg0, arg1) //arg0复制到arg1
		
		
		
	}
	
	public static void outPut(String s,Collection object){
		System.out.print(s + ":   ");
		for(Object o:object){
			System.out.print(" " + o.toString());
		}
		System.out.println("");
	}
	
	
}
