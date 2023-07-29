package com.assignment.patternprograms;

import java.util.Scanner;

public class Pattern21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String which needs to be printed ");

        String s = scan.nextLine();
        System.out.println("** Printing the pattern... **");
 
	for (int i=1;i<=s.length();i++) {
		 
         for (int j=i;j<=s.length();j++) {
             if(j==i||j==s.length())
                 System.out.print(s.charAt(i - 1));
             else
                 System.out.print("  ");
         }
 System.out.println();
	 }
	 for (int i=s.length()-1;i>=1;i--) {
         for (int j=i;j<=s.length();j++) {
             if(j==i||j==s.length())
                 System.out.print(s.charAt(i - 1));
             else
                 System.out.print("  ");
         }
      System.out.println();
	 }
     scan.close();
}
}
