package Calcul_App.New.calculator;

import java.util.Scanner;

public class App 
{
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("This is calculator App");
		int first;
     	int second;
     	int choice;
		
		
		System.out.println("Please enter first number: ");			
		first=sc.nextInt();
		
		System.out.println("Please enter second number: ");
		second=sc.nextInt();
		
	    System.out.println ("for addition press 1= +");
	    System.out.println ("for subtraction press 2= -");
	    System.out.println ("for multiplication press 3= *");
	    System.out.println ("for division press 4= /");
 
        choice=sc.nextInt();
        System.out.println("choice");
 
        switch(choice)
 
 {
 case 1:
 System.out.println(first+second);
  break;
 
 
 
 
case 2:
	System.out.println ("result is:" +(first-second));
	break;
			
 

 
 case 3:
 
	System.out.println ("result is:" +(first/second));
	break;
	
 
 
 
	 case 4:
	 System.out.println ("result is:" +(first*second));
	 break;
	 
 
 default  :System.out.println("end");
 break;
 }}}

