package week3.day1.homeassignment.StringMethod;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
	    String text2="potss";
		if(text1.length()==text2.length()) {
			System.out.println("\"Lengths match");		
			}
		else
		{
			System.out.println("\"Lengths mismatch");
		}
		
		char[] ch1 = text1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = text2.toCharArray();
		Arrays.sort(ch2);
		if (ch1==ch2) {
			System.out.println("The given strings are Anagram");
		}
		else
		{
			System.out.println("The given strings are not an Anagram");
		}
		
		
		
	}

}
