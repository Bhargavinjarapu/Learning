import java.util.*;
class Largest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,large,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the array a elements");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		large=a[0];
		for(i=1;i<n;i++)
		{
			if(a[i]>large)
				large=a[i];
		}
		System.out.println("largest element in a given array is :- "+large);	
	}
}
