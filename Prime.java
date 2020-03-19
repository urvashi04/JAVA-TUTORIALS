package javatutorial;

import java.util.Scanner;

public class Prime
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		boolean isPrime = true;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(n  + "This is Prime Number");
		}
		else
		{
			System.out.println(n  + "This is not Prime");
		}
	}

}
