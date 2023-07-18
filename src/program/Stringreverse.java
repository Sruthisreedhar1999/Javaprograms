package program;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args) {
		String s, r = "";   
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string:");  
	      s = in.next();   
	      int length = s.length();   
	      for ( int i = length - 1; i >= 0; i-- )
	      {
	         r = r + s.charAt(i);  
	      }
	      System.out.println("Reverse ="+r);
	}
}


