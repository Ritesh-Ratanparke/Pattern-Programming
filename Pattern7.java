import java.util.*;
class Pattern7
{
	public static void main(String[] Ar)
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value of size n");
		int n = sc.nextInt();
		for(int i=0; i<=n;i++)
		{
			for(int j=0;j<=5;j++)
			{if(i%2==0)
				System.out.print("1");
			else
				System.out.print("0");
			}
			System.out.println();
			
		}
					
	}
}