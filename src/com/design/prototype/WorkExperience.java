package com.design.prototype;

/**
 * …Ó∂»∏¥÷∆
 * @author kk
 *
 */
public class WorkExperience implements Cloneable{
	private String workStartTime = "";
	private String workEndTime = "";
	private String company = "";
	public String getWorkStartTime() {
		return workStartTime;
	}
	public void setWorkStartTime(String workStartTime) {
		this.workStartTime = workStartTime;
	}
	public String getWorkEndTime() {
		return workEndTime;
	}
	public void setWorkEndTime(String workEndTime) {
		this.workEndTime = workEndTime;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Object outClone() throws CloneNotSupportedException{
		return this.clone();
	}
}
