package ConditionalStatement;

public class NestedIfDemo {
	public static void main(String[] args) {
		
		int num1 = 110;
		int num2 = 20;
		int num3 = 100;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1);
			}else {
				System.out.println(num3);
			}
		}else {
			if(num2>num3) {
				System.out.println(num2);
			}else {
				System.out.println(num3);
			}
		}
	}

}
