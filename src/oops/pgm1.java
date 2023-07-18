package oops;
class member
{
	String name,address;
	int age,salary;
	long phoneno;
	public void printdetails()
	{
		System.out.println("Name of employee="+name);
		System.out.println("age of employee="+age);
		System.out.println("phoneno of employee="+phoneno);
		System.out.println("address of employee="+address);
		System.out.println("address of employee="+salary);
		
		
	}
	
	
}
class employee extends member
{
	String specialization;
	public void print()
	{
		System.out.println("Specialization of employee="+specialization);
	}
}
class manager extends member
{
	String department;
	public void printde()
	{
		System.out.println("department of employee="+department);
	}
}

public class pgm1 {

	public static void main(String[] args) {
		employee e=new employee();
		e.name="arun";
		e.age=34;
		e.phoneno=345213455;
		e.address="tdjsjjjkkla";
		e.salary=34567;
		e.printdetails();
		e.specialization="java";
		e.print();
		manager m=new manager();
		m.name="athira";
		m.age=34;
		m.phoneno=345213455;
		m.address="tdjsjjjkkla";
		m.salary=34567;
		m.printdetails();
		m.department="cs";
		m.printde();
		
		
	}

}
