package oops;
abstract class cars
{
	abstract public void accelarator();
	public void speed()
	{
		System.out.println("Car speed");
	}
}
class bmw extends cars
{

	@Override
	public void accelarator() {
		System.out.println("accelartor");
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {
		bmw b=new bmw();
		b.accelarator();
		b.speed();
		

	}

}
