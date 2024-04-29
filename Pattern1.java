import java.util.*;
class Pattern1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		
		System.out.println("enter the value of n");
		n=sc.nextInt();
		sc.close();
	
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			 {
				System.out.print("*");
			 }
			System.out.println();
		}
	}
}
