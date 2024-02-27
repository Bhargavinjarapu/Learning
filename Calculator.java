import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("******** SIMPLE CALCULATOR **********");
		System.out.println("+:Addition");
		System.out.println("-:Subtraction");
		System.out.println("*:Multiplication");
		System.out.println("/:Division");
		
		int a,b,result;
		char choice;
		
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();

		System.out.println("enter the choice");
		choice=sc.next().charAt(0);
		sc.close();
		switch(choice)
		{
			case '+': result=a+b;
				  System.out.println("addition of two numbers is"+result);
				  break;
			case '-': result=a-b;
				  System.out.println("subtraction of two numbers is"+result);
				  break;
			case '*': result=a*b;
				  System.out.println("multiplication of two numbers is"+result);
				  break;
			case '/': result=a/b;
				  System.out.println("Division of two numbers is"+result);
				  break;
			default: System.out.println("Invalid option");	  
		}
	}
}
