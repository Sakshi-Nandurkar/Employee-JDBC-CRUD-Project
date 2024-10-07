package com.Test;

import java.util.Scanner;

import com.Controller.ControllerEmp;

public class ClientEmp {

	public static void main(String[] args) throws Exception {
		
		
		ControllerEmp controller = new ControllerEmp();
		Scanner sc = new Scanner(System.in);

		
		while(true) {
			System.out.println("welcome to employee application");
			System.out.println("\n1. See Employee\n2. Insert Employee \n3. Update Employee \n4. Delete Employee\n5. Exit");
			int choice = sc.nextInt();
			
			
			switch(choice) {
			
			case 1 : controller.getAllEmployee();
			break;
			
			case 2 :controller.insertEmployee();
			break;
			
			case 3: controller.updateEmployee();
			break;
			
			case 4: controller.deleteEmployee();
			break;
			
			default : System.exit(0);
			}
		
		//sc.close();
		}
	
	
	
	}

}
