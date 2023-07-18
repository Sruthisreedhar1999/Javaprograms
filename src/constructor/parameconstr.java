package constructor;

public class parameconstr {


		int empid;
		String empname;
		public parameconstr(int empid,String empname)
		{
			this.empid=empid;
			this.empname=empname;
		}

		public static void main(String[] args) {
			parameconstr e=new parameconstr(101,"arun");
			System.out.println(e.empid);
			System.out.println(e.empname);

			
			

		}

	}
