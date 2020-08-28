package com.nt.bo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class EmployeeBo {
	
	private int empId;
	private String name;
	private String designation;
	private String address;

}
