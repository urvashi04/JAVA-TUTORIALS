package aaa;

public class Ternary 
{
	public static void main(String[] args)
	{
		// This code is in if and else statement and how you can use it in ternary i will explain
		int i = 1;
		int j = 5;
		// if(i==1)
		//  j=6;
		// else
		// j=7;
		
		// TERNARY OPERATOR USING ?:
		
		j = i==1?6:7; // if i ==1 then it will jump to 6 else 7
		System.out.println(j);
		
		// ANOTHER EXAMPLE OF TERNARY OPERATOR
			
	    Object obj1;
		Object obj2;
		
		obj1=new Integer(10);
		System.out.println(obj1);
		
		obj2 = true?new Integer(10):new Double(15.0); // so it will give the result 10.0 a double value as in ternary operator it will give the true value but it will give the largest type i.e (Double)
		
		System.out.println(obj2);
	}

}
