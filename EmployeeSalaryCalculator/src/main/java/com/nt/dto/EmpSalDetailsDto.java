package com.nt.dto;

public class EmpSalDetailsDto {
	
	private long empId;
	private String empName;
	private float basicSalary;
	private float hra;
	private float lta;
	public EmpSalDetailsDto() {
		super();
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	public float getHra() {
		return hra;
	}
	public void setHra(float hra) {
		this.hra = hra;
	}
	public float getLta() {
		return lta;
	}
	public void setLta(float lta) {
		this.lta = lta;
	}
	@Override
	public String toString() {
		return "EmpSalDetailsDto [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hra="
				+ hra + ", lta=" + lta + "]";
	}
	
	
	

}
