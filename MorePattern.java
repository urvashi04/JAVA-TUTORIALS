package javatutorial;

public class MorePattern
{
	public static void main(String[] args)
	{
		// So, it will print pattern 
		     
		//      * * * * *
		
		 for(int i=1;i<=5;i++)
		{
			System.out.print(" * ");
		} 
	
		// Next pattern
		  
		//     ****
		//     ****
		//     ****
		//     ****
		
		for(int i = 1; i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	
		// Next pattern :
		/*    1 2 3 4
		 *    1 2 3 4
		 *    1 2 3 4
		 *    1 2 3 4
		 */
		
		 for(int i=1;i<=4;i++)
		 {
			 for(int j=1;j<=4;j++)
			 {
				 System.out.print(j +" ");
			 }
			 System.out.println(" ");
		 }

		 /* Next pattern
		  * 1 1 1 1
		  * 2 2 2 2
		  * 3 3 3 3
		  * 4 4 4 4
		  */
		 
		 for(int i=1;i<=4;i++)
		 {
			 for(int j=1;j<=4;j++)
			 {
				 System.out.print(i+ " ");
			 }
			 System.out.println(" ");
		 }
		 
		 /* Next Pattern
		  * 1 2 3 4
		  * 2 3 4 1
		  * 3 4 1 2
		  * 4 1 2 3
		  */
		 
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				{
					System.out.print(k-4 + " ");
				}
				else
				{
					System.out.print(k + " ");
				}
			}	
			System.out.println(" ");
		}	
	}	
}
