package oops;


	class university
	{
		public void department()
		{
			System.out.println("cs");
		}
	}
	class MG extends university
	{

		@Override
		public void department() {
			System.out.println("bcom");
			// TODO Auto-generated method stub
			super.department();
		}
		
	}
	
	public class Methodoverride {

	public static void main(String[] args) {
		MG d=new MG();
		d.department();
		
		
		

	}

}
