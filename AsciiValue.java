package javatutorial;

public class AsciiValue
{
	public static void main(String[] args)
	{
		// Ascii Value is of 7 bits
		// and 2^7 = 128 bits
		// so, range of Ascii is 0 - 127
		// ASCII --> American Standard Code for Information Interchange
		
		for(int i=0;i<=127;i++)
		{
			System.out.printf("%d : %c \n",i,i); 
		}
		
	}

}
