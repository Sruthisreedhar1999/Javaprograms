package exception;

public class Exceptionpgm {

	public static void main(String[] args) {
		try
		{
			int a=20,b=0,c;
			c=a/b;
			System.out.println(c);
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arithematic Exception");
		}
		try
		{
			int a[]=new int[3];
			a[0]=30;
			a[1]=20;
			a[2]=40;
			System.out.println(a[3]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println("Arrayindexoutofbound exception");
		}
		
	try
	{
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
		System.out.println("Nullpointer Exception");
	}
	}
}
		

	


