package ControlStatement;

public class DoWhileLoopDemo {
	
	public static void main(String[] args) {
		
//		int i = 1;
//		do {
//			System.out.println("hello");
//			i--;
//			
//		}while(i>0);
		
//		
//		int i = 1;
////		do {
////			
////			System.out.println("hello");
////			;
////		} 
//		int num=158;
//		int amrnum=num;
//		int r=0;
//		int sum=0;
//		while(num>0) {
//			r=num%10;
//			num=num/10;
//			sum=sum+(r*r*r);
//			
//		};
//		if (sum==amrnum) {
//			System.out.println("amrstong number ");
//		}
//		else {
//			System.out.println("not an amrstrong number ");
//		}
		int num=2;
		while(num<=10) {
			if ((num%2)==0) {
				if((num%3)==0) {
					System.out.println(num);
				}
			}
			num++;
		}
	}

}
