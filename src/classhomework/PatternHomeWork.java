package classhomework;

import java.util.Scanner;

public class PatternHomeWork {

	public static void main(String[] args) {

		System.out.println("Enter your rows no.");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {

			for (int k = 1; k <= rows - i; k++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
			}
			
			System.out.println();
		}
		for(int i=1; i<rows; i++) {
			
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rows-i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}

}
