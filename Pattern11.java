import java.util.*;
class Pattern11
{
	public static void main(String[] Ar)
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value of size n");
		int n = sc.nextInt();
		int k=1;
		for(int i=0; i<=n;i++)
		{
			for(int j=0;j<=i+1;j++)
			{
				
				if(j%2!=0)
					System.out.print("*");
				else
					System.out.print(k++);
				
			}
			System.out.println();
			
		}
					
	}
}