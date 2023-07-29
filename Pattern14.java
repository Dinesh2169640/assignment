package com.assignment.patternprograms;

public class Pattern14 {
	public static void main(String[] args) {
		int n=5;
		for (int i=0;i<n;i++) {
            int m=1;
            for (int j=n-i;j>1;j--) {
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++) {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
		for (int i=n;i>=0;i--) {
            int m=1;
            for (int j=n;j>1;j--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print(m+" ");
                m++;
            }
            System.out.println();
        }
	}

}
