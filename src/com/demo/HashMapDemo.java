package com.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {
	
	public static void main(String[] args) {
		//hashMap的遍历方法
		HashMap hashMap = new HashMap();
		
		hashMap.put("1", "A");
		hashMap.put("2", "B");
		hashMap.put("3", "C");
		hashMap.put("4", "D");
		hashMap.put("5", "E");
		hashMap.put("6", "F");
		hashMap.put("7", "G");
		hashMap.put("8", "H");
		
		//遍历方法1：
		Iterator iterator = hashMap.entrySet().iterator();
		while(iterator.hasNext()){
			Entry entry = (Entry)iterator.next();
			Object key = entry.getKey();
			System.out.println(key +"=" + entry.getValue());
		}
		
		//遍历方法2
		Iterator iter = hashMap.keySet().iterator();
		while(iter.hasNext()){
			Object key = iter.next();
			Object value = hashMap.get(key);
			System.out.println(key +"="+ value);
		}
		
	}
}
