package scannercls;

import java.util.Scanner;

public class Stringpalindrome {

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
	      if (s.equals(r)) 
	      {
	         System.out.println("Entered string is palindrome.");  
	      }
	      else  
	      {
	    	  System.out.println("Entered string is not palindrome");   
	      }
	           
	   }  
	}  

	