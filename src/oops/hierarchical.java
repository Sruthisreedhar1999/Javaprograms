package oops;
class bird
{
	public void color()
	{
		System.out.println("birdcolor");
	}
}
class parrot extends bird
{
	public void fly()
	{
		System.out.println("can fly");
	}
}
class pigeon extends bird
{
	public void eat()
	{
		System.out.println("can eat");
	}
}


public class hierarchical {

	public static void main(String[] args) {
		pigeon p=new pigeon();
		p.eat();
		p.color();
		parrot pa=new parrot();
		pa.fly();
		pa.color();
		Accessmodifier a=new Accessmodifier();
		System.out.println(a.c);
		System.out.println(a.b);
		
		

	}

}
