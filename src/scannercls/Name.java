package scannercls;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String a=sc.nextLine();
		sc.next().charAt(3);
		System.out.println("Name is:"+a);
	}

}
