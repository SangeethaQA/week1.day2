package week1.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		int i=text1.length();
		int j=text2.length();
		if (i==j)
		System.out.println("length is equal");
		else 
			System.out.println("length is not equal");
		char [] str= text1.toCharArray();
		char [] str1=text2.toCharArray();
		Arrays.sort(str);
		Arrays.sort(str1);
		
		boolean result= Arrays.equals(str, str1);
		if (result== true)
			System.out.println("string is anagram");
		else
			System.out.println("string is not anagram");
		
		
	}
}


