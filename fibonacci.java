/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0)
	{
	    int n=in.nextInt();
	    long a=0;
	        long b=1;
	        long s=0;
	         System.out.print("1"+" ");
	    for(int i=0;i<n-1;i++)
	    { 
	         s=a+b;
	        a=b;
	        b=s;
	       System.out.print(s+" ");
	    }
	    
	}
	
	}
}
