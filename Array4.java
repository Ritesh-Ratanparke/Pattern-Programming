import java.util.*;
class Array4
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
		   
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		
		for(int i=0;i<=n-1;i++)
		{ if(key==arr[i]);
		   {
		   System.out.println("The key "+key+" found at index"+i);
		   break;
		   }
		}
		System.out.println("The sum of all array elements in odd indexes is "+sum);
    }
}