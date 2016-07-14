package com.flp.ems.view;

import java.util.Scanner;

import com.flp.ems.util.Validate;

import java.util.HashMap;

public class UserInteraction {
static void addEmployee(){
	Scanner scn = new Scanner(System.in);
	System.out.println("enter the name of the employee");
	String name=scn.next();
	System.out.println("enter the kin_id of the employee");
	int kin_id=scn.nextInt();
	System.out.println("enter the phone number of the employee");
	long ph_no=scn.nextLong();
	System.out.println("enter the address of the employee");
	String addr=scn.next();
	System.out.println("enter the date of birth of the employee");
	String dob=scn.next();
	System.out.println("enter the date of joining of the employee");
	String doj=scn.next();
	System.out.println("enter the department of the employee");
	String dept=scn.next();
	System.out.println("enter the project of the employee");
	String proj=scn.next();
	System.out.println("enter the role of the employee");
	String role=scn.next();
	HashMap hm = new HashMap();
	if(Validate.validateDate(doj)&& Validate.validateDate(dob))
	{
		hm.put(1, name);
		hm.put(2, kin_id);
		hm.put(3, ph_no);
		hm.put(4, addr);
		hm.put(5, dob);
		hm.put(6, doj);
		hm.put(7, dept);
		hm.put(8, proj);
		hm.put(9, role);
		
		
		
	}
		

	
	
	
	
	
}
static void modifyEmployee(){
	
}
static void removeEmployee(){
	
}
static void searchEmployee(){
	
}
static void getAllEmployee(){
	
}
	

}
