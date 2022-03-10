package com.test.emp;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author Abdul Warish 10-Mar-2022
 */
public class Employee {
	
	public static void main(String[] args) {
		EmployeeDto emp = new EmployeeDto();
		
		List<EmployeeDto> list = new LinkedList<EmployeeDto>();
		emp.setName("Abdul");

		list.add(emp);
		list.add(emp);
	}

}
