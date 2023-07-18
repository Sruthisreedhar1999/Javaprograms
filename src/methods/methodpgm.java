package methods;

public class methodpgm {

	public static void main(String[] args) {
		methodpgm a=new methodpgm();
		a.add();
		
		int subt=a.sub();
		System.out.println("subtract="+subt);
		int mult=a.mul(20,5);
		System.out.println("multiple="+mult);
		a.div(2.5,5);
		

	}
	//method without returntype and parameter
	public void add()
	{
		int a=6,b=7,c;
		c=a+b;
		System.out.println("sum="+c);
	}
//method with returntype and without parameter
	public int sub()
	{
		int a=6,b=7,c;
		c=a-b;
		return(c);
		}
	//method with returntype and with parameter
	public int mul(int a,int b)
	{
		
		int c=a*b;
		return(c);
		}
	////method without returntype and with parameter
	public void div(double a,double b)
	{
		
		double c=a/b;
		System.out.println("div="+c);
				}
	
	
}
