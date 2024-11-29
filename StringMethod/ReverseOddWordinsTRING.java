package week3.day1.homeassignment.StringMethod;

public class ReverseOddWordinsTRING {
	public static void main(String[] args) {
		String test = "I am a software tester";
		
		String[] splittest=test.split(" ");
		char [] oddwords=null;
		
		
		for(int i=0;i<splittest.length;i++) 
		{
			if(i%2==0) 
			{
				// Even-position words (0-based index)
				System.out.print(""+splittest[i]+"");
			}
			
			else
			{
				 // Odd-position words (0-based index)
				oddwords=splittest[i].toCharArray();
				for(int j=oddwords.length-1;j>=0;j--) 
				{
					//System.out.print(" ");
					System.out.print(oddwords[j]);
					
				}
				
			}
			 if (i < splittest.length - 1) {
		            System.out.print(" ");
		        }
			
			
	}
		 // Add space between words except after the last word
       
	
		
	}

}
