package oops;
class emp
{
	private String empname;
	private String empdesignation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		emp e=new emp();
		e.setEmpname("ARUN");
		e.setEmpdesignation("DEVELOPER");
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpdesignation());
		

	}

}
