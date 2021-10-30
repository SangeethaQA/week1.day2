package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= new String("madam");
String rev="";
char[] str1=str.toCharArray();
for (int i=str1.length-1;i>=0;i--)

	rev=rev+str1[i];

if (rev.equals(str))
	
	System.out.println("string is palindrome");
		
else
	
	System.out.println("string is not palindrome");
	



	}

}
