package com.nt.vo;

public class EmpSalDetailsVo {
	
	private String empId;
	private String empName;
	private String basicSalary;
	private String hra;
	private String lta;
	public EmpSalDetailsVo() {
		super();
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}
	public String getHra() {
		return hra;
	}
	public void setHra(String hra) {
		this.hra = hra;
	}
	public String getLta() {
		return lta;
	}
	public void setLta(String lta) {
		this.lta = lta;
	}
	@Override
	public String toString() {
		return "EmpSalDetailsVo [empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", hra="
				+ hra + ", lta=" + lta + "]";
	}
	

}
