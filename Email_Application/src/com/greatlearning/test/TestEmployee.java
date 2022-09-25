package com.greatlearning.test;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServiceImpl;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee("Harshit", "Choudary");
		CredentialServiceImpl cs = new CredentialServiceImpl();
		String generatedEmail;
		char[] generatedPassword;
		
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		if (option == 1) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastname().toLowerCase(),"tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
			
		else if (option == 2) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastname().toLowerCase(),"adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
			
		else if (option == 3) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastname().toLowerCase(),"hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
			
		else if (option == 4) {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastname().toLowerCase(),"lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}
		else
			System.out.println("Enter a valid option");
		
		sc.close();
	}
}
