package com.nt.dao;

import java.sql.SQLException;
import java.util.List;

import com.nt.bo.EmployeeBo;

public interface EmpManagedDao {
	
	public List<EmployeeBo> getEmployeeDetails(String desg1,String desg2,String desg3) throws SQLException;

}
