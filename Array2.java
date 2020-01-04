import java.util.*;
class Array2
{
	public static void main(String[] Ar)
	{ 
     	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the array size");
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter Array elements");
		for(int i=0;i<=n-1;i++)
		   arr[i]=sc.nextInt();
		   
        System.out.println("The printed array is");
		for(int i=0;i<=n-1;i++)
		   System.out.println(arr[i]);
		   
		int sum=0;   
		for(int i=0;i<=n-1;i++)
		{	if(i%2==0)
			{
			sum += arr[i];
			}
		}	
		System.out.println("The sum of all array elements in even indexes is "+sum);
    }
}