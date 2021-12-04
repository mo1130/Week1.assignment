package week1.assignments;

public class CharOccuranceAssignment {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		int count=0;
		
		char chr='e';
		
		
		char[] arr = str.toCharArray();
		
		int l= arr.length;
		
		
		 for(int i=0;i<l;i++) {
			 
			 if(chr==(arr[i]))
			 
			 
			 {
				 count++;
			 }
			 
			  }
		 System.out.println("Given char occurance count is "+count);
		 }
	}


