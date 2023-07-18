package controlstms;

public class calculator {

	public static void main(String[] args) {
		int a=2,b=5,opern=3;
		switch(opern)
		{
		case 1:opern=a+b;
		       System.out.println("sum is"+opern);
		       break;
		case 2:opern=a-b;
	       System.out.println("subtraction is"+opern);
	       break;
		case 3:opern=a*b;
	       System.out.println("Multiplication is"+opern);
	       break;
		case 4:opern=a/b;
	       System.out.println("Division is "+opern);
	       break;
		default:
	       System.out.println("Invalid");
	       break;
	
		}
		
		

	}

}
