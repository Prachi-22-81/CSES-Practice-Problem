

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MissingNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner Sc=new Scanner(System.in);
		
		long n=Sc.nextLong();
		long ans=n;
	for(long i=1;i<n;i++)
	{
	   
	    long num=Sc.nextLong();
	    ans ^= i;
		ans ^= num;
	}
	System.out.print(ans);
	}
}
