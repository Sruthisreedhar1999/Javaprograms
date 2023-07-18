package constructor;

import java.util.Scanner;

public class Suminteger {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Suminteger s=new Suminteger();
		int Suminteger=s.Sum(num);
		
		System.out.println("SUM="+Suminteger);
		

	}
	public int Sum(int num)
	{
		int sum=0;
		while(num!=0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		return(sum);
	}

}
