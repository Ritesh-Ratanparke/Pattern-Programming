import java.util.*;
class Factorial{
	
	int fact(int n)
	{  if(n<=1)
		return 1;
	else return (fact(n)*fact(n-1));
	}
	   
	  
	public static void main(String[]Ar)
    { int n;
	Scanner sc = new Scanner(System.in);
	Factorial fc = new Factorial();
	  System.out.println("This program is to find factorial of a given number");
	  System.out.println("Enter the number");
	  do
	  {  n = sc.nextInt();
	    if(n == 0)
		  System.out.println("Input accepted");
	    else 
		  System.out.println("Input not accepted");
	  break;
	  }
	  while(n>0);
	  System.out.printf("The factorial of given number is "+fc.fact(n));  
	
	}
}