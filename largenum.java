import java.io.*;
import java.util.*;
class largenum
{
//finding the largest number within 3 numbers by using IF ELSE statement. 
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		int c=30;
		int temp;
		if((a>=b)&&(a>=c))
		{
			System.out.println(a+" is large number");
		}
		else if((a<=b)&&(b>=c))
		{
			System.out.println(b+" is large number");
		}
		else
		{
			System.out.println(c+" is large number");
		}
	}
}				
		