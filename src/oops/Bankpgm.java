package oops;

import java.util.Scanner;

interface bank
{
	
	public void showdetails();
	public void balance();
	public void deposit();
	public void withdraw();
}
class Sbi implements bank
{
    
    int balance=0,deposit,withdraw,d,w;
    
	@Override
	public void showdetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name of customer:");
		String name=sc.next();
		System.out.println("Enter ac number:");
		String acno=sc.next();
		System.out.println("Enter bankname:");
		String bankname=sc.next();
		System.out.println("Name of customer is:"+name);
		System.out.println("Account number of customer is:"+acno);
		System.out.println("Name of bank is:"+bankname);
		
	}
	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to deposit");
		int d=sc.nextInt();
		deposit=balance+d;
		System.out.println("Balance amount is:"+deposit);
		
		
	}
	@Override
	public void balance() {
		
		System.out.println("Balance amount:"+deposit);
		
		
	}

	@Override
	public void withdraw() {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to withdraw");
		int w=sc.nextInt();
		withdraw=deposit-w;
		System.out.println("Balance amount is:"+withdraw);
		
	}

	
	
}

public class Bankpgm {

	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.showdetails();
		s.balance();
		s.deposit();
		
		s.withdraw();

	}

}
