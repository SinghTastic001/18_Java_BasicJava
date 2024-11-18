package ControlStatement;

public class ArmstrongDemo {

	public static void main(String[] args) {

		/*
		 * int num = 154; int og = num; int sum = 0; int r = 0;
		 * 
		 * 
		 * while(num!=0) {
		 * 
		 * r = num%10; System.out.println(r);
		 * 
		 * sum = sum+r*r*r; System.out.println(sum);
		 * 
		 * num = num/10; System.out.println(num);
		 * 
		 * System.out.println(og); }
		 * 
		 * if(og==sum) { System.out.println("armstrong number"); }else {
		 * System.out.println("not armstrong number"); }
		 */

	/*	int num = 1634;
		int armsnum = num;
		int sum = 0;
		int r = 0;

		while (num != 0) {

			r = num % 10;
			sum = sum + r * r * r * r;
			num = num / 10;
		}
		if (armsnum == sum) {
			System.out.println(armsnum + " is armstrong number");
		} else {
			System.out.println(armsnum + " is not armstrong number");  
		}*/
		
		
		int num = 1634;
		int sum = 0;
		int org = num;
		int count = 0;
		int r = 0;
		int temp = num;
		
		while(temp!=0) {
			count++;
			temp = temp/10;
		}
		
		while(num!=0) {
			
			r = num%10;
			sum = sum + (int)Math.pow((double) r,(double) count);
			num = num/10;
		}
		if(org==sum) {
			System.out.println(org+" is armstrong number");
		}else {
			System.out.println(org+" is not armstrong number");
		}
		
		
		
		
	}

}
