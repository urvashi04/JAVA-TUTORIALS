package javatutorial;

import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args)
	{
		int n,r,s=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:  ");
		n = sc.nextInt();
		int t=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
			
			if(t==s)
			{
				System.out.print( " This is Palindrome");
			}
			else
			{
				System.out.print( "This is not Palindrome ");
			}
			
		
	}

}
