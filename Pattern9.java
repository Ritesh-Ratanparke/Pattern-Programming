import java.util.*;
class Pattern11
{
	public static void main(String[] Ar)
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter value of size n");
		int n = sc.nextInt();
		int k=0;
		for(int i=1; i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				if(j%2!=0)
					System.out.print("*");
				k++;
			}
			System.out.println();
			
		}
					
	}
}