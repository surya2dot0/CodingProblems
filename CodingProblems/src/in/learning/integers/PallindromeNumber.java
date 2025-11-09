package in.learning.integers;

import java.util.Scanner;

public class PallindromeNumber {

	public static void pallindromeNumber(int n) {
        int chk = n;
		int rev = 0;
		int reminder = 0;
		while(n > 0) {
			reminder = n % 10;
			rev = (rev * 10) + reminder;
			n = n / 10;
		}
		if(chk == rev)
			System.out.println("Pallindrome");
		else System.out.println("Not a Pallindrome");
		
	}
	public static void main(String[] args) {

		/* Comment added */
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int n= Integer.parseInt(sc.nextLine());
		pallindromeNumber(n);
	}

}
