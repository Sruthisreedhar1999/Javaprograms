package methods;

import java.util.Scanner;

public class Diffshapes {
	

	public static void main(String[] args) {
		Diffshapes d=new Diffshapes();
		d.triangle();
		int rect=d.rectangle();
		System.out.println("Area of rectangle is="+rect);
	double cir=d.circle(3.3);
		System.out.println("Area of circle is="+cir);
		d.square(3);
		
		
		

	}
 public void triangle()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter height:");
	 int h=sc.nextInt();
	 System.out.println("Enter breadth:");
	 int b=sc.nextInt();
	 double area;
	 area=0.5*b*h;
	 System.out.println("Area of triangle is="+area);
	 
	 
 }
 public int rectangle()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter length:");
	 int l=sc.nextInt();
	 System.out.println("Enter breadth:");
	 int b=sc.nextInt();
	 int area;
	 area=l*b;
	 return(area);
	 
	 
 }
 public double circle(double r)
	{
	 
	 double area;
	 area=3.14*r*r;
	 return(area);
		}
 public void square(int a)
	{
	 
		int area;
		area=a*a;
		
		System.out.println("Area of square="+area);
				}
 
}
