package week1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		for (int i=0;i<test.length();i++)
		{
			char chr=test.charAt(i);
			
			if (test.charAt(i)% 2==0)
			{
				
				System.out.println(i);
			}
			
		}
		
		
	}

}
