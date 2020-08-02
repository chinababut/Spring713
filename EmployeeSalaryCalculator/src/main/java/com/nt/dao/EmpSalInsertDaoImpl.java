package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.nt.bo.EmpSalDetailsBo;

public final class EmpSalInsertDaoImpl implements EmpSalInsertDao {
	private static final String EMPSAL_INSERTQUERY = "INSERT INTO EMPLOYEE_SALARY VALUES(?,?,?,?,?)";
	
	private DriverManagerDataSource ds;
	

	public EmpSalInsertDaoImpl(DriverManagerDataSource ds) {
	
		this.ds = ds;
	}

	@Override
	public int insertEmpSalDetails(EmpSalDetailsBo bo) throws Exception {
		Connection conn = null;
		PreparedStatement ps = null;
		int result= 0;
		
		conn = ds.getConnection();
		ps = conn.prepareStatement(EMPSAL_INSERTQUERY);
		
		ps.setLong(1,bo.getEmpId());
		ps.setString(2,bo.getEmpName());
		ps.setFloat(3,bo.getgSalary());
		ps.setFloat(4, bo.getDetutions());
		ps.setFloat(5, bo.getNetSalary());
		
		result = ps.executeUpdate();
		System.out.println("inseted record:"+bo);
	   return result;
	}

}
