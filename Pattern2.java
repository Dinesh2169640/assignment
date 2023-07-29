package com.assignment.patternprograms;

public class Pattern2 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=12;j++) {
				if(i==1||j==1||i==10||j==12||i==12-j||i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
   }

}
