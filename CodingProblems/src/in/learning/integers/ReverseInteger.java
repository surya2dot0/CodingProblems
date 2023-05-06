package in.learning.integers;

import java.util.Scanner;

public class ReverseInteger {
	

	public static void reverseInteger(int n) {

		int rev = 0;
		int reminder = 0;
				while(n > 0) {
					reminder = n % 10;
					rev = (rev * 10) + reminder;
					n = n /10;
				}
		System.out.println("Reversed Integer = " + rev);
	}
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int n= Integer.parseInt(sc.nextLine());
		reverseInteger(n);
	}
}
