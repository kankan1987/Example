package com.design.prototype;

/**
 * ԭ��ģʽ
 * ��ȸ��ƺ�ǳ�㸴��
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
		System.out.println("������"+this.name);
		System.out.println("���䣺"+this.age);
		System.out.println("����������"+this.workExperience.getWorkStartTime()
				                   +"��" + this.workExperience.getWorkEndTime()
				                   +"������ְ��" + this.workExperience.getCompany());
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
