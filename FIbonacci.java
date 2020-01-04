import java.util.*;
class Fibonacci
{
	public static void main(String[] Ar)
	{ 
     	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
		int n= sc.nextInt();
		int a=0,b=1,c;
		System.out.println();
		System.out.println("The fibonacci series is");
		for(int i=2;i<=n;i++)
		{   c = a+b;
	        a=b;
			b=c;
			System.out.println(c);
	    } 
    }
}