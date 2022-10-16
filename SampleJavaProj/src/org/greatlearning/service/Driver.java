package org.greatlearning.service;

import java.util.Scanner;

import org.greatlearning.model.Emp;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Emp e=new Emp("Yousuf", "Shoeb");
		CredentialService credentialService=new CredentialService();
		int ch;
		do
		{
			System.out.println("Please enter the name of the Department from the following");
		System.out.println("1.Techincal");
		System.out.println("2.Admin");
		System.out.println("3.HumanResource");
		System.out.println("4.Legal");
		ch= sc.nextInt();
		switch (ch) {
		case 1:
			String email=credentialService.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
			char[] password=credentialService.generatePassword();
			credentialService.showCredentials(e, email, password);
			break;
			
		default:
			break;
		}
		}while(ch<=4);
			
		}

	}


