package com.nt.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVo;

public class NestedIOCContainerTest {

	public static void main(String[] args) {
		
		
		Scanner sc = null;
	    String desg1 = null,desg2 =null,desg3 =null;
		sc = new Scanner(System.in);
		ApplicationContext parent = null,child = null;
		System.out.println("enter desg1");
		desg1 = sc.next();
		System.out.println("enter desg2");
		desg2 = sc.next();
		System.out.println("enter desg3");
		desg3 = sc.next();
		parent  = new ClassPathXmlApplicationContext("com/nt/cfgs/business.xml"); 
		child  = new ClassPathXmlApplicationContext(new String[] {"com/nt/cfgs/presentation.xml"},parent); 
		
		MainController controller = child.getBean("controller",MainController.class);
		List<EmployeeVo> vo = null;
		
		try {
			vo = controller.gatherEmpDetails(desg1, desg2, desg3);
			System.out.println("EmployeDetails:::"+vo);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
