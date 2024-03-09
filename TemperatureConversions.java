import java.util.*;
class TemperatureConversions
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float it,ct=0,ft=0,kt=0;
		/* 
		it -> input temperature
 		ct -> celcius temperature
		ft -> fahrenheit temperature
		kt -> kelvin temperature
		*/
	
		
		System.out.println("********TEMPERATURE CONVERSIONS*******");
		System.out.println("Enter the temperature");
		it=sc.nextFloat();
		System.out.println("1.Celcius");
		System.out.println("2.Fahrenheit");
		System.out.println("3.Kelvin");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		sc.close();

		switch(choice)
		{
			 case 1:ct=it;
				  kt=ct+273.03f;
				  ft=(ct*9.0f)/5+32.0f;
				  break;
			 case 2: ft=it;
				  ct=5/9.0f*(ft-32.0f);
				  kt=ct+273.03f;
				  break;
			 case 3:kt=it;
          ct=kt-273.03f;
				  ft=(ct*9.0f)/5+32.0f;
				  break;
			default: System.out.println("Invalid option");
				 break;
		}
		System.out.println("Celsius temperature="+ct);
		System.out.println("fahrenheit temperature="+ft);
		System.out.println("Kelvin temperature="+kt);
	}
}
				  
