package constructor;

public class Defaultconstr {
	int empid;
	String empname;
	public Defaultconstr()
	{
		empid=103;
		empname="arun";
	}

	public static void main(String[] args) {
		Defaultconstr e=new Defaultconstr();
		System.out.println(e.empid);
		System.out.println(e.empname);

		
		

	}

}
