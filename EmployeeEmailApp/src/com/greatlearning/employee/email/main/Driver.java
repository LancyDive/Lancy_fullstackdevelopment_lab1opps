package com.greatlearning.employee.email.main;

import java.util.Scanner;

import com.greatlearning.employee.email.model.Employee;
import com.greatlearning.employee.email.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		CredentialService service = new CredentialService();
		
		Employee emp = new Employee("Ram","Kumar");
		System.out.println("Please select the depratment from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int choice = sc.nextInt();
		String department = null;
		switch(choice) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			System.out.println("Please select valid option");	
		}
	    if(department !=null) {
	    	emp.setDepartment(department);
	    	 }
            
	    String emailAddres = service.generateEmailAddress(emp);
	    emp.setEmailAddress(emailAddres);
	    String password = service.generatePassword();
	    emp.setPassword(password);
	    
	    service.showCredentials(emp);
	    
	    
	    
	}

}
