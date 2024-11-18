package ControlStatement;

public class Demo {
	
	public static void main(String[] args) {
		
		int num = 1634;
		int sum = 0;
		int count = 0;
		int r = 0;
		int armsnum = num;
		int tempc = num;
		
		while(tempc!=0) {
			count++;
			tempc = tempc/10;
//			System.out.println(count);
		}
		
		while(num!=0) {
			
			r = num%10;
			sum = sum + (int) Math.pow((double)r, (double)count);
			num = num/10;
		}
		if(armsnum==sum) {
			System.out.println("armstrong number");
		}else {
			System.out.println("not armstrong number");
		}
	}

}
