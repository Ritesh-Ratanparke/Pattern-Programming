import java.util.*;
class BinaryPyramid
{ public static void main(String[] Ar)
	{ int n,s,c,h,i,p,o=0;
	Scanner sc = new Scanner(System.in);
	 
      do{
		   System.out.println("Enter height of pyramid");
		   h = sc.nextInt();
		   if(h>0 && h<=23)
			   System.out.println("Input accepted.");
		   else 
			   System.out.println("Input not acceptable");
		   break;
	    }
	  while(h>0 && h<=23);
	  i=h;
	  for(n=1; n<=h ;n++)
	  { for(s=0; s<=i-1 ;s++)
		  System.out.print(" ");
	  
     	  System.out.print("1");
	      if(n>1)
		  {for(p=1;p<=o+n-2 ;p++)
			  System.out.print("0");
		 
			System.out.print("1");
		   }
			System.out.println();
		i--;
		o++;
		}
		
	  }
	}
