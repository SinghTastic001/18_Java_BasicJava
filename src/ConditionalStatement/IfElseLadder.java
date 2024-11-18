package ConditionalStatement;

import java.util.Scanner;

public class IfElseLadder {
	
	public static void main(String[] args) {
		
		System.out.println("1.sum\n2.sub\n3.div\n4.mul\n5.mod");
		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
		int sc1 = sc.nextInt();
		
	
		int num1 = 10;
		int num2 = 20;
		
		if(sc1==1) {
			System.out.println("sum "+ (num1+num2));
		}else if(sc1==2) {
			System.out.println("sub "+ (num1-num2));
		}else if(sc1==3) {
			System.out.println("div "+ (num1/num2));
		}else if(sc1==4) {
			System.out.println("mul "+ (num1*num2));
		}else if(sc1==5) {
			System.out.println("mod "+ (num1%num2));
		}else {
			System.out.println("operation not perform ");
		}
	}

}
