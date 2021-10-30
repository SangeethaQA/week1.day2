package week1.day2.assignments;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		boolean b =true;

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char [] arr= test.toCharArray();
		for (int i=0;i<arr.length;i++)
		{
		 if (b== Character.isLetter(arr[i]))
		
			letter =letter+1;
		else if (b==Character.isDigit(arr[i]))
		
			num=num+1;
		
		else if (b==Character.isSpaceChar(arr[i]))
		
			space=space+1;
		
		else specialChar=specialChar+1;
			
		}
		System.out.println("Letter is :"+letter);	
		System.out.println("number is :"+num);	
		System.out.println("Space is :"+space);	
		System.out.println("Special character is :"+specialChar);	
				
	}

}

