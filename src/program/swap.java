package program;

public class swap {

	public static void main(String[] args) {
		int a=3,b=2,temp;
		temp=a;
		a=b;
		b=temp;		
		System.out.println(+a);
		System.out.println(+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a+  "b="+b);
				
		
		
	}

}
