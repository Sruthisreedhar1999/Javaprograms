package oops;

public class Accessmodifier {
	private int a=7;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args) {
		Accessmodifier a=new Accessmodifier();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);

	}

}
