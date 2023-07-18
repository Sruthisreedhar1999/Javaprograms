package oops;
class car
{
	public void color()
	{
		System.out.println("Diffcolor");
	}
}
class maruti extends car
{
	public void speed()
	{
		System.out.println("50km/hr");
	}
}
public class Singleinher {

	public static void main(String[] args) {
		maruti m=new maruti();
		m.color();
		m.speed();
	}

}
