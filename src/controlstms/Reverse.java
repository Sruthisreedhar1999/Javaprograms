package controlstms;

public class Reverse {

	public static void main(String[] args) {
		int n=12345,r=0,rem;
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n=n/10;
		}
		System.out.println("Reverse of the number is"+r);

	}

}
