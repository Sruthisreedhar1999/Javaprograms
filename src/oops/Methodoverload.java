package oops;

public class Methodoverload {
	public void add()
	{
		int a=10,b=30,c;
		c=a+b;
		System.out.println(c);
	}
	public void add(int a,int b)
	{
		
		int c=a+b;
		System.out.println(c);
	}
	public void add(int a,double b)
	{
		
		double c=a+b;
		System.out.println(c);
	}
	public void add(double a,int b)
	{
		
		double c=a+b;
		System.out.println(c);
	}


	public static void main(String[] args) {
		Methodoverload m=new Methodoverload();
		m.add();
		m.add(20, 30);
		m.add(20.6, 6);
		m.add(9, 10.5);
		
	}
	

}
