package com.assignment.patternprograms;

public class Pattern17 {
	public static void main(String[] args) {
		int n = 5;
	 for (int i = 0; i <= n; i++)
     {
         char c = 'A';
         for (int j = 0; j <= i; j++)
         {
             System.out.print( c+ " ");
             c++;
         }
         System.out.println();
         
     }
	 for (int i = n-1; i >= 0; i--)
     {
         char c = 'A';
         for (int j = 0; j <= i; j++)
         {
             System.out.print( c+ " ");
             c++;
         }
         System.out.println();
     }
	 }
}
