package javatutorial;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		int temp = n;
		int r,sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum = sum + r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("This is Armstrong");
		}
		else
		{
			System.out.println(" This not");
		}
	}

}
