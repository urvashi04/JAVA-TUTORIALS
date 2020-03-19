package javatutorial;


public class Swap
{
	public static void main(String[] args)
	{
		int a=5,b=4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
		// Another Method
	
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("a: "+ a);
		System.out.println("b: "+ b);
		
	}

}
