package in.learning.integers;

import java.util.Scanner;

public class FizzBuzz {

	public static void printFizzBuzz(int n) {
		for(int i=3;i<=n;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("Number = "+ i + " FIZZ BUZZ");
			} else if(i%3 == 0) {
				System.out.println("Number = "+ i + " FIZZ");
			} else if(i%5 == 0) 
				System.out.println("Number = "+ i + " BUZZ");
	}
}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int n= Integer.parseInt(sc.nextLine());
		printFizzBuzz(n);
	}

}
