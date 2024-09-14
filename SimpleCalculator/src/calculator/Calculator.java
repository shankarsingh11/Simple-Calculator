package calculator;

import java.util.Scanner;

public class Calculator {
    
	public static void input()
	{
		int choice;
		double first,second,result = 0;
		
		while(true) 
		{
			print_menu();
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
		     if(choice==7) 
		     {   
		    	 System.out.println("Exit");
		    	 break; 
		     }
		     
		     if(choice<1 || choice>7)
		     {
		    	 System.out.println("Invalid Menu Choice: ");
		    	 continue;
		     }
		     
		     System.out.println("Please enter the first number: ");
		     first = sc.nextDouble();
		     System.out.println("Please enter the second number: ");
		     second = sc.nextDouble();
		     
		     switch(choice)
		     {
		     case 1://Add
		    	result = add(first,second);
		    	break;
		     case 2://Subtract
		    	 result = subtract(first,second); 
		    	 break;
		     case 3://Multiply
		    	 result = multiply(first,second);
		    	 break;
		     case 4://Divide
		    	 result = division(first,second); 
		    	 break;
		     case 5://Modules
		    	 result = modulas(first,second);
		    	 break;
		     case 6://Power
		    	 result = pow(first,second); 
		    	 break;
		    	 
		     }
		     
		     if(!isnan(result)) 
		     {
		    	 
		     System.out.println("Result of operation is : " + result);
		     
		     }
		     
		    
		}
		
	 }

	public  static boolean isnan(double result) {
		
		return false;
	}

	public  static void print_menu() 
	{
		System.out.println("Welcome to Simple Calculator: ");
		System.out.println("Choose one of the following options: ");
		System.out.println("1.Addition");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		System.out.println("5.modulas");
		System.out.println("6.Power");
		System.out.println("7.Exit");
		System.out.println("Now, enter your choice: ");
		
	}
	
	public static double multiply(double first,double second)
	{
		return first * second;
	}
	
	public static double subtract(double first,double second)
	{
		 return first - second;
	}
	
	public static double add(double first,double second)
	{
		 return first + second;
	}
	
	
	public static double pow(double first,double second)
	{
		 if(second==0) 
		 {
			 return 1;
		 }else
		 {
			 return Math.pow(first, second);
		 }
	}
	
	public static double modulas(double first,double second)
	{
		 if(second == 0)
		 {
			 System.out.println("Invalid Arguments for modules : ");
			 return 0;
		 }else
		 {
			 return first % second;
		 }
	}
	
	public static double division(double first,double second)
	{
		if(second==0)
		{
			System.out.println("Cannot be divided by 0 :" + "NaN");
			return first / second;
		}else
		{
			return first / second;
		}
	}	
}	

