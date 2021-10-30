package week1.day2.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to chennai";
		int count=0;
		char [] str1= str.toCharArray();
		for (int i=0;i<str1.length;i++)
			{if (str1[i]=='e')
			{count =count+1;
			}
			}
		System.out.println("Occurrance of e is:-"+ count);
		

	}


}
