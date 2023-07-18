//package oops;
interface Bank
{
	public void deposit();
	public void withdraw();
}
interface Bankdetails
{
	public void creditcard();
}
class SBI implements Bank,Bankdetails
{

	@Override
	public void deposit() {
System.out.println("sbideposit");
		
	}

	@Override
	public void withdraw() {
		System.out.println("sbiwithdraw");
		
	}

	@Override
	public void creditcard() {
		System.out.println("sbicredit");
		
		
	}
	
}
class Federal implements Bank,Bankdetails
{
	@Override
	public void deposit() {
		System.out.println("federalwithdraw");
		
		
		
	}

	@Override
	public void withdraw() {
		System.out.println("federalwithdraw");
		
		
	}

	@Override
	public void creditcard() {
		System.out.println("federalcredit");
		
		
	}

}
public class Interface {
	

	public static void main(String[] args) {
	Bank f=new Federal();
		f.deposit();
		f.withdraw();
		Bankdetails b=new Federal();
		b.creditcard();
		 f=new SBI();
	f.deposit();
		f.withdraw();
		b.creditcard();
		
		
	}

}

