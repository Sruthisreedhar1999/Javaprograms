package program;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int pos= 0,neg=0,zero=0;
        

        System.out.print("Enter the number of integers you want to check: ");
        int count = sc.nextInt();
        System.out.print("Enter numbers:");
        for (int i = 0; i < count; i++) {
            int n = sc.nextInt();

            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive count: " + pos);
        System.out.println("Negative count: " + neg);
        System.out.println("Zero count: " + zero);
    }
}