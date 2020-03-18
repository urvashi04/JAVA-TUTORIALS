package aaa;

public class LeftRight
{
	public static void main(String[] args)
	{
		//int a= 8; // 1 0 0 0(binary no. of 8)
		//int b=a<<2; // 1 0 0 0 0 0 (append two zero when it is left shift)
		//int b = a>>2; // 1 0 (skip two numbers for right shift)
		int a= 25; // 1 1 0 0 1
		int b = a>>2; // 1 1 0 (skip two no. in right shift)
		System.out.println(b);
	}

}
