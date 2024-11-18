package ConditionalStatement;

import java.util.Scanner;

public class ElseIfLadder {

    public static void main(String[] args) {

        System.out.println("To know timing, enter your schedule:");
        Scanner sc = new Scanner(System.in);

        String value = sc.nextLine();

        if (value.equals("awake up timing")) {
            System.out.println("6 am");
        } else if (value.equals("dinner timing")) {
            System.out.println("9 pm");
        } else if (value.equals("studying timing")) {
            System.out.println("9 am");
        } else {
            System.out.println("Not found");
        }

        // Close the scanner to release resources
        sc.close();
    }
}
