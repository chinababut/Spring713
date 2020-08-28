package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDto;

public interface EMPManagedservice {
	
	public List<EmployeeDto> fetchEmpDetails(String desg1,String desg2,String desg3)throws Exception;

}
