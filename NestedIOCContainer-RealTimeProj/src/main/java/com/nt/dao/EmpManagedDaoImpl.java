package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBo;

public final class EmpManagedDaoImpl implements EmpManagedDao {
	private final String SELECT_QUERY = "SELECT empid,name,designation,address from employee where designation = ? OR designation = ? OR designation = ? ";
	private DataSource ds;

	public EmpManagedDaoImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public List<EmployeeBo> getEmployeeDetails(String desg1, String desg2, String desg3) throws SQLException {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		EmployeeBo bo = null;
		List<EmployeeBo> list = null;
		list = new ArrayList<EmployeeBo>();

		conn = ds.getConnection();
		ps = conn.prepareStatement(SELECT_QUERY);
		ps.setString(1, desg1);
		ps.setString(2, desg2);
		ps.setString(3, desg3);
		rs = ps.executeQuery();

		while (rs.next()) {
			bo = new EmployeeBo();
			bo.setEmpId(rs.getInt(1));
			bo.setName(rs.getString(2));
			bo.setDesignation(rs.getString(3));
			bo.setAddress(rs.getString(4));
			list.add(bo);
		}

		return list;
	}
}
