package stringpgm;

import java.util.Scanner;

public class Splitpgm {

	public static void main(String[] args) {
		
		
		String s="selenium webdriver is used for webapplication testing";
		String[] sr=s.split(" ");
		for(String r:sr)
		{
			System.out.println(r);
			if(r.contains("webapplication"))
			{
				
				break;
			}
		}
			
	}
	}		


	