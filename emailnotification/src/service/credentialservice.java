package service;
import java.util.Random;
import java.util.random.*;

import model.Employee;

public class credentialservice {
	// generate an email
	public String generateEmail( String firstName, String lastName, String department)
	{
		String email= firstName+lastName+"@"+"greatlearning.com";
		return email;
		
	}
	public String generatepassword() {
		String capitalletters="ABCDEFGHIJKLMNOPQSTUVWXYZ";
		String smallletters="abcdefghijklmnopqrstuvwxyz";
		String number="0123456789";
		String specialcharacter="!@#$%^&*<>?";
		String values= capitalletters+smallletters+number+specialcharacter;
		
		Random random =new Random();
		char[] password= new char[8];
		for (int i=0;i<8;i++)
		{
			password[i]=values.charAt(random.nextInt(values.length()));
		}
		return String.valueOf(password);
		
	}
	public void showcreds(Employee emp, String email, String password)
	{
		System.out.println("Hello "+emp.getFirstName() + " your generated credentials");
		System.out.println("Email:"+email);
		System.out.println("Password:"+password);
		
	
	}
}
