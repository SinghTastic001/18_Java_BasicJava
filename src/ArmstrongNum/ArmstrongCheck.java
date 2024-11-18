package ArmstrongNum;

public class ArmstrongCheck {
	
	public static void main(String[] args) {
		
	
		int armnum = 407;
		int sum = 0;
		int store = armnum;
		int count = 0;
		int temp = armnum;
		
		while(temp>0) {
			count++;
			temp = temp/10;
		}
		
		while(armnum>0) {
			
			int r = armnum%10;
			sum = sum + (int) Math.pow((double) r, (double) count );
			armnum = armnum/10;
		}
		
		if(store==sum) {
			System.out.println("armstrong number");
		}
		else {
			System.out.println("Notarmstrong number");
		}
	}

}
