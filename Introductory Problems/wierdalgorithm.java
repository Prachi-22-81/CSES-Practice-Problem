import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class wierdalgorithm
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc=new Scanner(System.in);
		long n=Sc.nextInt();
		while (n != 1) {
		System.out.print(n+" ");
		
		n = (n % 2==1) ? 3 * n + 1 : n / 2;
	}
	System.out.print(1);
	}
}
