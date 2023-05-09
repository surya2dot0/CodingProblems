package in.learning.integers;

import java.util.Scanner;

public class Factorial {

	public static void factorial(int n) {
		
		int fact=1;
		for(int i=n;i>1;i--) {
			fact = fact * i;
		}
		System.out.println("Factorial value of "+n+" is = "+fact);
	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n  = scan.nextInt();
		factorial(n);
		
	}

}
