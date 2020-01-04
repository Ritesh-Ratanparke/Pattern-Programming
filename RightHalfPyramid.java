import java.util.*;
class RightHalfPyramid{
	public static void main(String[]Ar)
	{ int n,s,c,h;
	Scanner sc = new Scanner(System.in);
	 
      do{
		   System.out.println("Enter height of half-pyramid");
		   h = sc.nextInt();
		   if(h>0 && h<=23)
			   System.out.println("Input accepted.");
		   else 
			   System.out.println("Input not acceptable");
		   break;
	    }
	  while(h>0 && h<=23);
	  int i=h;
	  for(n=1;n<=h;n++)
	  {   
           for(s=1; s<=i-1; s++)
		   { System.out.print(" ");
		      //print spaces
		   }
	       for(c=2; c<=n+1; c++)
		     System.out.print("*"); //print characters
		System.out.println();
	     i--;
	  }
	}
}