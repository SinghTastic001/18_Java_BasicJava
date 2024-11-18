package ConditionalStatement;

import java.util.Scanner;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		System.out.println("1.Monday\n2.Tuesday\n3.Wednesday\n4.Thursday\n5.Friday\n6.Saturday\n7.Sunday");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("saturday");
				break;
			case 7:
				System.out.println("sunday");
				break;
			default:
				System.out.println("Wrong input");
				break;
		}
	}

}
