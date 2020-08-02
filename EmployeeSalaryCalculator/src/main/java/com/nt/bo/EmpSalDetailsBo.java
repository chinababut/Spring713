package com.nt.bo;

public class EmpSalDetailsBo {
	
	private long empId;
	private String empName;
	private float gSalary;
	private float detutions;
	private float netSalary;
	public EmpSalDetailsBo() {
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
	public float getgSalary() {
		return gSalary;
	}
	public void setgSalary(float gSalary) {
		this.gSalary = gSalary;
	}
	public float getDetutions() {
		return detutions;
	}
	public void setDetutions(float detutions) {
		this.detutions = detutions;
	}
	public float getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(float netSalary) {
		this.netSalary = netSalary;
	}
	@Override
	public String toString() {
		return "EmpSalDetailsBo [empId=" + empId + ", empName=" + empName + ", gSalary=" + gSalary + ", detutions="
				+ detutions + ", netSalary=" + netSalary + "]";
	}
	
	
	
	
	
	

}
