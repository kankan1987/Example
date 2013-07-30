package com.design.prototype;

/**
 * 原型模式
 * 深度复制和浅层复制
 * @author kk
 *
 */
public class Resume implements Cloneable {
	private String name;
	private String age;
	private WorkExperience workExperience;
	public Resume(){
		
	}
	
	public Resume(WorkExperience workExperience) throws CloneNotSupportedException{
		this.workExperience = (WorkExperience) workExperience.outClone();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public WorkExperience getWorkExperience() {
		return workExperience;
	}
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}
	
	public void Show(){
		System.out.println("姓名："+this.name);
		System.out.println("年龄："+this.age);
		System.out.println("工作经历："+this.workExperience.getWorkStartTime()
				                   +"至" + this.workExperience.getWorkEndTime()
				                   +"工作就职于" + this.workExperience.getCompany());
	}
	
	public Object OutClone() throws CloneNotSupportedException{	
		return this.clone();
	}
	
	public Object InClone() throws CloneNotSupportedException{
		Resume obj = new Resume(this.workExperience);
		obj.name = this.name;
		obj.age = this.age;
		return obj;
	}
}
