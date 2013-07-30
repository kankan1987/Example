package com.exception;

public class TestException {
	public static void main(String[] args) {
		try{
			System.out.println("aaaaaaaa");
			System.exit(1);
			//throw new IllegalAccessError("DDDD");
		}catch(IllegalAccessError e){
			System.out.println(e);
		}finally{
			System.out.println("KKKKKKK");
		}
	}
}