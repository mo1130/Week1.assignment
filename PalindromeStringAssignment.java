package week1.assignments;

public class PalindromeStringAssignment {

	public static void main(String[] args) {
		
		String str1= "mango";
		String rev= "";
		
		int l= str1.length();
		
		for (int i = l-1; i >=0; i--) {
			
			rev= rev+ str1.charAt(i);
			
			}
		if (str1.equals(rev)) {
			
			
			System.out.println(" Given string is a palindrome");
		}
		
		else {
			System.out.println(" Given staring is not a palindrome");
		}
		
		
		
	}

}
