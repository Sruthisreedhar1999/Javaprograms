package scannercls;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		int n, temp,res=0,rem;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = s.nextInt();
        temp=n;
        while(temp!= 0)
        {
         rem=temp%10;
         res=res+(rem*rem*rem);
         temp=temp/10;
        }
        if(n==res)
        {
            System.out.println(" Armstrong number");
        }
        else
        {
            System.out.println(" Not an Armstrong number");
        }    
    }
}