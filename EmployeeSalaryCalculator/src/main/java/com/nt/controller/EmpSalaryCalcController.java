package com.nt.controller;

import com.nt.dto.EmpSalDetailsDto;
import com.nt.service.CalculateGsalService;
import com.nt.vo.EmpSalDetailsVo;

public class EmpSalaryCalcController {
	
	CalculateGsalService service;

	public EmpSalaryCalcController(CalculateGsalService service) {
		
		this.service = service;
	}
	
	public void empSalDetailsRegister(EmpSalDetailsVo vo ) throws Exception {
		EmpSalDetailsDto dto = null;
		
		dto = new EmpSalDetailsDto();
		
	dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
	dto.setEmpId(Long.parseLong(vo.getEmpId()));
	dto.setEmpName(vo.getEmpName());
	dto.setHra(Float.parseFloat(vo.getHra()));
	dto.setLta(Float.parseFloat(vo.getLta()));
	int result = service.calculateSal(dto);
	if(result !=0)
		System.out.println("EmpSalDetails inseterd Sucessfully");
	else 
		System.out.println("EmpSalDetails not inseterd ");
	

}
}
