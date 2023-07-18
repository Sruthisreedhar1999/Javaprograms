package stringpgm;

public class Stringopern {

	public static void main(String[] args) {
		//1.concatenation
		String s="hii";
		String s1="good morning";
		String s2="Hii welcome back to india";
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(1+2+s+4+5);
		//2.equals
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		//3.contains
		System.out.println(s2.contains("welcome"));
		//4.tolowercase & touppercase
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		//5.trim
		System.out.println(s2.trim());
		//6.length
		System.out.println(s.length());
		//7.startswith&endswith
		System.out.println(s2.startsWith("Hii"));
		System.out.println(s2.endsWith("india"));
		//8.replace
		System.out.println(s.replace("hii","hello"));
		//9.compareto
		System.out.println(s.compareTo(s2));
		//10.indexof
		System.out.println(s1.indexOf(0));
		//11.substring
		System.out.println(s1.substring(1, 7));
		//12.charat
		System.out.println(s1.charAt(5));
		//13.split
		String[] sr=s1.split(" ");
		for(String r:sr)
		{
			System.out.println(r);
		}
	}		
}
