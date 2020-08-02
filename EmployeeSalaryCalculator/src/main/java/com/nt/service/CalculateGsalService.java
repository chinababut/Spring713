package com.nt.service;

import com.nt.bo.EmpSalDetailsBo;
import com.nt.dao.EmpSalInsertDao;
import com.nt.dto.EmpSalDetailsDto;

public class CalculateGsalService {
	
	EmpSalInsertDao dao = null;
	
	
	
	public CalculateGsalService(EmpSalInsertDao dao) {
		super();
		this.dao = dao;
	}



	public  int  calculateSal(EmpSalDetailsDto dto) throws Exception {
		float basicSalary = 0.0f;
		float hra = 0.0f;
		float lta = 0.0f;
		float gSalary = 0.0f;
		float netSalary = 0.0f;
		float detuctions = 0.0f;
		float annualSal = 0.0f;
		EmpSalDetailsBo bo =null;
		
		basicSalary = dto.getBasicSalary();
		hra = dto.getHra();
		lta = dto.getLta();
		gSalary = basicSalary+hra+lta;
		annualSal = gSalary*12;
		System.out.println("annualSal::"+annualSal);
		if(annualSal>=250000 && annualSal<=500000) {
			
			detuctions =  annualSal*5/100;
			System.out.println("1");
		}
		else if (annualSal>=500000 && annualSal<=1000000) {
			detuctions =  annualSal*10/100;
			System.out.println("2");
		}
		else if(annualSal>=1000000){
			detuctions =  annualSal*25/100;
			System.out.println("3");
		}
		
		netSalary = gSalary - detuctions;
		     bo = new EmpSalDetailsBo();
			bo.setEmpId(dto.getEmpId());
			bo.setEmpName(dto.getEmpName());
		    bo.setgSalary(gSalary);
		    bo.setDetutions(detuctions);
		    bo.setNetSalary(netSalary);
		    
		    return dao.insertEmpSalDetails(bo) ;  
		    
		
	}
	
	

}
