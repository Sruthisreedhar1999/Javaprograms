package program;

import java.util.Scanner;

public class Totalcharaters {

	public static void main(String[] args) {
        int c = 0;
        String s;    
        Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string:");  
	      s = in.next();  
	      int length = s.length();   
         for(int i = 0; i < s.length(); i++) {    
            if(s.charAt(i) != ' ')    
            {
                c++;   
            }
        }      
        System.out.println("Total number of characters in a string:"+c);    
    }    
}     