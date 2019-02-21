/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		    }
		    Arrays.sort(a);
		    for(int i=0;i<n;i++)
		    {
		    System.out.println(a[n-2]);
		    break;
		    }
		}
	}
}

