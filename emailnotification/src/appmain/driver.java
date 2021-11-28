package appmain;

import java.util.Scanner;

import  model.Employee;
import service.credentialservice;

public class driver {
	public static void main( String[] args)
	{
		//employee class object
		//take user input for data members
		//scanner
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName= scanner.next();
		
		System.out.println("Enter last name");
		String lastName=scanner.next();
		
		System.out.println("Enter department");
		System.out.println("Enter the department from following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4. Legal");
		int choice =scanner.nextInt();
		String email=null;
		String password=null;
		credentialservice creser= new credentialservice();
		
		if(choice==1)
		{
			Employee emp=new Employee(firstName,lastName,"technical");
			email=creser.generateEmail(firstName,lastName,"technical");
			System.out.println("email is ::"+ email);
			password=creser.generatepassword();
			creser.showcreds(emp,email,password);
		}	
		else if(choice==2)
		{
			Employee emp=new Employee(firstName,lastName,"Admin");
			email=creser.generateEmail(firstName,lastName,"Admin");
			System.out.println("email is ::"+ email);
			password=creser.generatepassword();
			creser.showcreds(emp,email,password);
		}		
		else if(choice==3)
		{
			Employee emp=new Employee(firstName,lastName,"Human Resource");
			email=creser.generateEmail(firstName,lastName,"Human Resource");
			System.out.println("email is ::"+ email);
			password=creser.generatepassword();
			creser.showcreds(emp,email,password);
		}	
		else if(choice==4)
		{
			Employee emp=new Employee(firstName,lastName,"Legal");
			email=creser.generateEmail(firstName,lastName,"Legal");
			System.out.println("email is ::"+ email);
			password=creser.generatepassword();
			creser.showcreds(emp,email,password);
		}
		else {
			System.out.println("Enter valid input");
		}
		
		
		
		
		
		//Employee employee= new Employee();
		
		
	}

}
