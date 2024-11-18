package ConditionalStatement;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your age ");
		
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("able to vote");
		}else {
			System.out.println("unable to vote");
		}
	}

}
