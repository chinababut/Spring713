package com.nt.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBo;
import com.nt.dao.EmpManagedDao;
import com.nt.dto.EmployeeDto;

public class EmpManagedServiceImpl implements EMPManagedservice {
	
	
	private EmpManagedDao dao;
	
	public EmpManagedServiceImpl(EmpManagedDao dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDto> fetchEmpDetails(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeBo> list = null;
		
		List<EmployeeDto> listDto = null;
		EmployeeDto dto =null;
		
		listDto = new ArrayList();
		
		list = dao.getEmployeeDetails(desg1, desg2, desg3);
		
		for(EmployeeBo bo : list) {
			
			dto = new EmployeeDto();
			dto.setEmpId(bo.getEmpId());
			dto.setName(bo.getName());
			dto.setDesignation(bo.getDesignation());
			dto.setAddress(bo.getAddress());
			listDto.add(dto);
			
		}
			
		
		return listDto;
	}

	

}
