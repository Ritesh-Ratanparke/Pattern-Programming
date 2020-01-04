import java.util.*;
class PyramidNumbersAlternate
{ public static void main(String[] Ar)
	{ int n,s,c,h,i,o=0,b=0;
	Scanner sc = new Scanner(System.in);
	 
      do{
		   System.out.println("Enter height of half-pyramid");
		   h = sc.nextInt();
		   if(h>0 && h<=3)
			   System.out.println("Input accepted.");
		   else 
			   System.out.println("Input not acceptable");
		   break;
	    }
	  while(h>0 && h<=3);
	  i=h;
	  for(n=1; n<=h ;n++)
	  { for(s=0; s<=i-1 ;s++)
		  System.out.print(" ");
	    for(c=1; c<=n+o; c++)
		{ System.out.print(b);
	      b++;
		}
		System.out.println();
		i--;
		o++;
	  }
	}
}