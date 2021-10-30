package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		String rev="";
		char [] str1= test.toCharArray();
		for (int i=0;i<str1.length;i++)
		{
			if (i%2==1)
			{
				rev=rev+str1[i];
			}
		}
		System.out.println(rev.toUpperCase());

	}

}
