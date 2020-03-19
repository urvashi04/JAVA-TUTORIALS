package javatutorial;

import java.util.Scanner;

public class PerfectNumber
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:  ");
		n = sc.nextInt();
		boolean b= isPerfect(n);
		if(b)
		{
			System.out.println(" its a perfect number");
		}
		else
		{
			System.out.println(" its not a perfect number");
		}
		
	}
	public static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(n==sum)
			return true;
		return false;
	}

}
