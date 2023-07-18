package program;

public class operators {

	public static void main(String[] args) {
		//arithmetic operator
		int a=30,b=20;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		//assignment operator
		System.out.println("a=b"+(a=b));
		System.out.println("a+=b"+(a+=b));
		System.out.println("a*=b"+(a*=b));
		System.out.println("a/=b"+(a/=b));
		System.out.println("a-=b"+(a-=b));
		//relational operator
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		//logical operator
		String username="abc";
		String password="123";
		System.out.println(username=="abc" && password=="123");
		System.out.println(username=="abc"|| password=="128");
		System.out.println(!(username=="abc"));
		System.out.println(!( password=="123"));
		//Unary operator
		int r=8;
		System.out.println(r++);
		System.out.println(r);
		System.out.println(++r);
		System.out.println(r);
		System.out.println(--r);
		System.out.println(r);
		System.out.println(r--);
		System.out.println(r);
		
		
		
		
		
		
		

	}

}
