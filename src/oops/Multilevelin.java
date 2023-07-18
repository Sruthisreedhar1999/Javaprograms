package oops;
class vehicle
{
	public void color()
	{
		System.out.println("Diffcolor");
	}
}
class bus extends vehicle
{
	public void speed()
	{
		System.out.println("50km/hr");
	}
}
class bike extends bus
{
	public void price()
	{
		System.out.println("1lakh");
	}
	
}


public class Multilevelin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike m=new bike();
		m.color();
		m.speed();
		m.price();
	}

}
