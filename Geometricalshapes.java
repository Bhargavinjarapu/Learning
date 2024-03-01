package com.sathya.C_conditional_statements;

import java.util.*;
class Geometricalshapes
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float area,radius,side,length,breadth,base,height;
		int choice;
		
		System.out.println("**********AREA OF GEOMETRICAL SHAPES***********");
		System.out.println("1:CIRCLE");
		System.out.println("2:SQUARE");
		System.out.println("3:RECTANGLE");
		System.out.println("4:TRIANGLE");
		
		System.out.println("enter the choice");
		choice=sc.nextInt();
		sc.close();
		
		switch(choice)
		{
			case 1: System.out.println("enter the radius");
				radius=sc.nextFloat();
				area=3.142f*radius*radius;
				System.out.println("Area of circle="+area);
				break;
			case 2: System.out.println("enter the side");
				side=sc.nextFloat();
				area=side*side;
				System.out.println("Area of square="+area);
				break;
			case 3: System.out.println("enter the length and breadth");
				length=sc.nextFloat();
				breadth=sc.nextFloat();
				area=length*breadth;
				System.out.println("area of rectangle="+area);
				break;
			case 4: System.out.println("enter the base and height");
				base=sc.nextFloat();
				height=sc.nextFloat();
				area=0.5f*base*height;
				System.out.println("area of trianlge="+area);
				break;	
			default:System.out.println("Invalid option");
				break;
		}
	}
}
