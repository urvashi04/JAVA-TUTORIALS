package javatutorial;

public class BreakStatement 
{
	public static void main(String[] args)
	{
		// for unlabeled break statement
		
		 for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break; // Unlabeled Break Statement(it will only break inner loop)
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		// for Labeled break statement
		
		urvashi: // you can use any identifier with : (colon) it will break outer loop
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break urvashi; // labeled Break Statement
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
