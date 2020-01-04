import java.util.*;
class Pyramid
{ public static void main(String[] Ar)
	{ Scanner sc = new Scanner(System.in);
	  int i,n,c,h,s,o=0;
	  do{
		  System.out.println("Enter height of pyramid");
		  h = sc.nextInt();
		  if(h>0 && h<=25)
			  System.out.println("Input accepted");
		  else
			  System.out.println("Input unacceptable");
		  System.out.println();
		  break;
	  } while( h>0 && h<=25);
	  i=h;
	  for(n=1; n<=h; n++)
	  { 
	    for(s=1; s<=i-1 ; s++)
		{ System.out.print(" ");
		}
		for(c=1;c<=n+o; c++)
		{ System.out.print("*");
		}
		System.out.println();
		i--;
		o++;
	  }
	}
}