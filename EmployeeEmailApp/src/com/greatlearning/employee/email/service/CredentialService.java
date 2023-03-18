package com.greatlearning.employee.email.service;

import java.util.Random;

import com.greatlearning.employee.email.model.Employee;

public class CredentialService implements CreadentialService {

	private final String COMPANY_DOMAIN = "gl.in";
	private final int PASSWORD_SIZE = 8;
	private String password;
	@Override
	public String generateEmailAddress(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		
		return firstName+lastName+"@"+department+COMPANY_DOMAIN;
	}

	@Override
	public String generatePassword() {
		String capitalCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallCase = capitalCase.toLowerCase();
		String num = "0123456789";
		String splChar = "!@#$%%^&*()";
		
		String passwordChar = capitalCase+smallCase+num+splChar;
		String password = "";
		Random random = new Random();
		for(int i=0;i<PASSWORD_SIZE;i++) {
			password = password + passwordChar.charAt(random.nextInt(passwordChar.length()));
		}
		return password;
	}

	@Override
	public String showCredentials(Employee employee) {
		System.out.println("Dear "+employee.getFirstName()+"Your Genereated Creadentials are ");
		System.out.println("Email --> "+employee.getEmailAddress());
		System.out.println("Passwor:-"+employee.getPassword());
		return null;
	}

}
