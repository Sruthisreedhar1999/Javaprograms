package oops;
interface basicanimal
{
	public void eat();
	public void sleep();
}
class monkey 
{
public void jump()
	{
		System.out.println(" can jump");
	}

	public void bite()
	{
		System.out.println(" can bite");
	}
	
}
class human extends monkey implements basicanimal
{
	public void speak()
	{
		System.out.println(" can speek");
	}

	@Override
	public void eat() {
		
		System.out.println(" can eat food");
	}

	@Override
	public void sleep() {
		System.out.println(" can sleep well");
		
	}
}

public class Interfacepgm2 {

	public static void main(String[] args) {
		
		human h=new human();
		h.speak();
		h.bite();
		h.eat();
		h.jump();
		h.sleep();

	}

}
