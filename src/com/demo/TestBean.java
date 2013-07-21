package com.demo;

public class TestBean implements Comparable<TestBean>{
	private String name;
	private Integer index;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	//@Override
	public int compareTo(TestBean o) {
		// TODO Auto-generated method stub
		return this.getIndex().compareTo(o.getIndex());
	}

	
	
}
