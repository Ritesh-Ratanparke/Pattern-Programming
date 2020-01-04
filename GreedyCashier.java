import java.util.*;
class GreedyCashier
{ public static void main(String[] Ar)
	{ int arr[][] = {{2000,0},{500,0},{100,0},{50,0},{20,0},{10,0},{5,0},{2,0},{1,0}};
    int i,j,amt;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the amount");
    do
	{amt = sc.nextInt();
	if(amt>0)
		break;
	}
	while(amt>0);
	
	for(i=0;i<=8;i++)
	{while(amt>0)
	{ if(amt>= arr[i][0])
		{	amt = amt - arr[i][0];
            arr[i][1] = arr[i][1]+1;
	    }
		else
			break;
	}
	}
	for(int k=0;k<=8;k++)
	{System.out.print("  "+arr[k][0]+"    ");
   	}
	System.out.println();
	for(int k=0;k<=8;k++)
	{	 System.out.print("  "+arr[k][1]+"    ");
	}

}
}