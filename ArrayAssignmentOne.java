package week1.assignments;

import java.util.Arrays;

public class ArrayAssignmentOne {  //missing element in array...

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);//1,2,3,4,6,7,8
		int l= arr.length;//7
		
		for(int i=1;i<=l;i++) 
		{
			
			//System.out.println(arr[i] );
			
			  if ( i!= arr[i-1]) {
				  

				  System.out.println("value which is not present in array is"  +i);
			      break; 
			  }  
			 
			
			
			
		}
		
	}

}
