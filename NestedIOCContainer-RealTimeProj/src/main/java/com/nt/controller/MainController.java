package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBo;
import com.nt.dto.EmployeeDto;
import com.nt.service.EMPManagedservice;
import com.nt.vo.EmployeeVo;

public class MainController {
	private EMPManagedservice service;
	
	public MainController(EMPManagedservice service) {
		this.service=service;
	}
	public List<EmployeeVo> gatherEmpDetails(String desg1,String desg2,String desg3)throws Exception{
		
		List<EmployeeVo> listVo = null;
		EmployeeVo vo  = null;
		
		listVo = new ArrayList<EmployeeVo>();
		
		List<EmployeeDto> listDto = service.fetchEmpDetails(desg1, desg2, desg3);
		
         for(EmployeeDto dto: listDto) {
			
		      vo = new EmployeeVo();
			vo.setEmpId(String.valueOf(dto.getEmpId()));
			vo.setName(dto.getName());
			vo.setDesignation(dto.getDesignation());
			vo.setAddress(dto.getAddress());
			listVo.add(vo);
			
		}

		
		
		return listVo;
		
	}
	
}
