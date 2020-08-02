package com.nt.test;

import java.util.Scanner;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.EmpSalaryCalcController;
import com.nt.vo.EmpSalDetailsVo;

public class EmpSalDetailsTest {

	public static void main(String[] args) {
	
		
		
		EmpSalDetailsVo vo = null;
		String empId = null;
		String empName = null;
		String basicSalary = null;
		String hra = null;
		String lta = null;
		DefaultListableBeanFactory factory = null;
		XmlBeanDefinitionReader reader = null;
		
		
		Scanner sc = null;
		vo = new EmpSalDetailsVo();
		sc = new Scanner(System.in);
		
		System.out.println("Enter Emp id::");
		empId = sc.next();
		System.out.println("Enter Emp Name::");
		empName = sc.next();
		System.out.println("Enter Emp basic salary::");
		basicSalary = sc.next();
		System.out.println("Enter Emp hra::");
		hra = sc.next();
		System.out.println("Enter Emp lta::");
		lta = sc.next();
		
		vo.setBasicSalary(basicSalary);
		vo.setEmpId(empId);
		vo.setEmpName(empName);
		vo.setHra(hra);
		vo.setLta(lta);
		
		
		factory = new DefaultListableBeanFactory();
	
		reader = new XmlBeanDefinitionReader(factory);
	 
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		EmpSalaryCalcController  control = factory.getBean("controller",EmpSalaryCalcController.class);
		
		try {
			control.empSalDetailsRegister(vo);
			sc.close();
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		
	}

}
