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
	    int a=in.nextInt();
	    int b=in.nextInt();
	     int c=in.nextInt();
	     boolean f=false;
	     for(int x=-22;x<=22&&!f;x++)
	     {
	         for(int y=-100;y<100&&!f;y++)
	         {
	             if(x!=y && x*x+y*y<c)
	             {
	                int z=a-x-y;
	                if (x!=z && y!=z && x*y*z==b && x*x+y*y+z*z==c)
	                 {
	                     System.out.println(x+" "+y+" "+z);
	                     f=true;
	                 }
	             }
	         }
	     }
	     if(!f)
	     {
	         System.out.println("No solution.");
	     }
	}
	}
}

