package com.design.prototype;
/**
 * ԭ��ģʽ��ȸ��ƺ�ǳ�㸴��
 * @author kk
 *
 */
public class PrototypeTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume rs = new Resume();
		rs.setName("SB");
		rs.setAge("22");
		WorkExperience workExperience = new WorkExperience();
		rs.setWorkExperience(workExperience);
		workExperience.setCompany("Զ�������˾");
		workExperience.setWorkStartTime("2011-07");
		workExperience.setWorkEndTime("2013-07");
		rs.Show();
		Resume rs1 = (Resume) rs.OutClone();
		Resume rs2 = (Resume) rs.InClone();		
		rs1.Show();
		rs2.Show();
		workExperience.setCompany("xxxxxx");
		rs1.Show();
		rs2.Show();

	}
}
