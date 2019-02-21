/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
 
public static void main(String[] args) {
 
Scanner s = new Scanner(new InputStreamReader(System.in));
 int count = 0 ;
 while (true) {
 
 int n = s.nextInt();
 if (n == 0)
 return;
 else {
 if(count!=0)
 System.out.println();
 }
 count++;
 int [] input = new int[n];
 
 for (int i = 0; i < n; i++)
 input[i] = s.nextInt();
 
for (int i = 0; i < n; i++) {
 for (int l = i+1; l < n; l++) {
 for (int j = l+1; j < n; j++) {
 for (int j2 = j+1; j2 < n; j2++) {
 for (int k = j2+1; k < n; k++) {
 for (int k2 = k+1; k2 < n; k2++) {
 System.out.println(input[i] +" "+ input[l] +" "+ input[j] +" "+ input[j2] + " "+ input[k] +" "+ input[k2]);
 }
 }
 }
 }
 }
 }
 }
 }
}

