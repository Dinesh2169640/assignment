package com.assignment.patternprograms;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        System.out.println("Enter the String which needs to be printed ");

	        String s = scan.nextLine();
	        System.out.println("** Printing the pattern... **");

	        for (int i = 1; i <= s.length(); i++) 
	        { 
	            for (int j = s.length(); j > i; j--)
	            {
	                System.out.print(" ");
	            }
	            for (int k = i * 2 - 1; k >= 1; k--)
	            {
	                System.out.print(s.charAt(i - 1));
	            }
	            System.out.println("");
	        }
	        scan.close();
	}

}
