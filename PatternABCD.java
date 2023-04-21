package day6;
/*
 *   ABCDEEDCBA 
 *   ABCD  DCBA   
 *   ABC    CBA     
 *   AB      BA
 *   A        A       
 */
public class PatternABCD {

	public static void main(String[] args) {
		 
         char k='A';
         int space=0;
		 for( int i=1;i<=5;i++)
		 {
			
			 for(int j=5;j>=i;j--)		 	 System.out.print(k++);		 
			 
		     for(int u=1;u<=space;u++)       System.out.print(" ");
			 
			 for(int j=5;j>=i;j--)		 	 System.out.print(--k);		
			 
			 space=space+2;
			 
			 System.out.println();
		 }
		
		
		
	}

}
