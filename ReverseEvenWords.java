package week1.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String [] split= test.split(" ");
		
		
		for (int i =1;i<split.length;i++)
			if (i%2==0)
			{
				System.out.println(split[i]);
			}
	}

}
