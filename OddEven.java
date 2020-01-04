import java.util.*;
//This class finds out odd and even numbers between two given numbers
class OddEven{
	public static void main(String[] Ar)
	{ int[] even = new int[100];
	  int[] odd =  new int[100];
	System.out.println("Enter any two numbers");;
	
	  Scanner sc = new Scanner(System.in);
	  int n1 = sc.nextInt();
	  int n2 = sc.nextInt();
	  int i=0;
	  int j=0;
	  int k=0;
	  for(i=n1;i<=n2;i++)
	  {  if(n1%2==0)
		   {even[j] = n1; 
		   j++;}
       else
	   {odd[k]=n1;
	   k++;}
	   n1++;
	  }
	  
	 System.out.println("Now the even numbers between the numbers are");
	 System.out.println("Even --> ");
	 for(int x: even) 
		 System.out.print(" "+x);
	 System.out.println("Odd -->");
	 for(int x: odd)
		 System.out.print(" "+x);
	  	}
}