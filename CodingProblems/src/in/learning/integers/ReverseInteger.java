package in.learning.integers;

import java.util.Scanner;

public class ReverseInteger {
	

	public static void reverseInteger(int n) {
		
		int count = 0;
		int num = n;
		int reminder = 0;
		int revNum = 0;
		
		do {
			
			num = num /10;
			count ++;
		}while(num>0);
		System.out.println("Value of count"+ count);
		int oCount = count;
        for(int i=0; i<count;i++) {
        	reminder = n % 10;
        	n = n / 10;
        if(oCount >= 1) {
        	do {
        	reminder = reminder * 10;
        	oCount --;
        	}while(oCount > 1);
        	
        }
        	revNum = revNum + reminder;
        }
		System.out.println("Reverse Number "+ revNum);
	}
	public static void main(String[] arg) {
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int n= Integer.parseInt(sc.nextLine());
		reverseInteger(n);
	}
}
