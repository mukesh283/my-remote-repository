package com.flp.ems.view;
import java.util.Scanner;
public class BootClass {

public static void main(){
	Scanner sc = new Scanner(System.in);
	System.out.println("\n 1.ADD EMPLOYEE \n 2.Modify Employee \n 3.Remove Employee \n 4.Search Employee \n 5.getAll Employee");
	int a=sc.nextInt();
	menuSelection(a);
}

static void menuSelection(int a){
	switch(a){
	case 1:UserInteraction.addEmployee();
	break;
	
	case 2:UserInteraction.modifyEmployee();
	break;
	case 3:UserInteraction.removeEmployee();
	break;
	case 4:UserInteraction.searchEmployee();
	break;
	case 5:UserInteraction.getAllEmployee();
	
	
	
	}
}
 


