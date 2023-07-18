package oops;
interface tvremote
{
	public void tvremote();
}
interface smarttvremote extends tvremote
{
	public void smarttvremote();
}
class Tv implements smarttvremote
{

	@Override
	public void tvremote() {
		System.out.println("tvremote");
		
	}

	
	
	@Override
	public void smarttvremote() {
		System.out.println("smarttvremote");
		// TODO Auto-generated method stub
		
	}
	}
	

public class Interfacepgm {

	public static void main(String[] args) {
		smarttvremote t=new Tv();
		t.tvremote();
		t.smarttvremote();
		

	}

}
