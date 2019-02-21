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
	    int g=0;
		while(in.hasNext())
		{
		    int n=in.nextInt();
		    
		    int a[]=new int[n];
		    long min=10000000;
		    if(n==0)
		    {
		        break;
		    }
		    for(int i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		    }
		    int m=in.nextInt();
		    int b[]=new int[m];
		    int ans=0;
		    g++;
		     System.out.println("Case"+" "+ g +":");
		    for(int j=0;j<m;j++)
		    {
		        b[j]=in.nextInt();
		    }
		    for(int i=0;i<m;i++)
		    {
		        int c=b[i];
		        for(int j=0;j<n;j++)
		        {
		            for(int k=j+1;k<n;k++)
		            {
		                int y=a[j]+a[k];
		                int x=Math.abs(y-b[i]);
		                if(x<min)
		                {
		                    ans=y;
		                   min=x;
		                }
		            }  
		        }
		       
		        System.out.println("Closest sum to"+" "+b[i]+" "+"is"+" "+ans+".");
		         min=10000000;
		       
		    }
		 
		}
		 
	}
}

