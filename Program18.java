package com.assignment.patternprograms;

public class Program18 {
	public static void main(String[] args) {
		int n =5;
		char ch = 'D';
		 for (int i=1;i<=n;i++) {
			 
	            for (int j=i;j<=n;j++) {
	                if(j==i||j==n)
	                    System.out.print(ch+" ");
	                else
	                    System.out.print("  ");
	            }
        System.out.println();
		 }
		 for (int i=n-1;i>=1;i--) {
	            for (int j=i;j<=n;j++) {
	                if(j==i||j==n)
	                    System.out.print(ch+" ");
	                else
	                    System.out.print("  ");
	            }
     System.out.println();
		 }
	}

}
