package week3.day1.homeassignment.StringMethod;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="changeme";
		ToUpperCase(s1);

	}

	
	public static void ToUpperCase(String s1) 
	{
		char[] ch=s1.toCharArray();
		for (int i=0;i<ch.length;i++) {
		if(i%2==1) {
			  System.out.print(Character.toUpperCase(ch[i]));
		
		}
		else {
			System.out.print(Character.toLowerCase(ch[i]));
		}
		}
		
		
		
	}
}
