import java.util.*;
class CreditCard
{  
    int digits(long n)
	{int count=0; 
	 while(n!=0)       //counts number of digits
	 { n /= 10;
      count++;
	 }
	 return count;
	}
	
	
	boolean checksum(long[] arr)
	{ long chksm1=0,chksm2=0;           //checksum validation
	   int i;
	  for(i=1;i<=arr.length-1;i++)
	  { arr[i] = arr[i]*2;               //multiplies every second digit of the number by 2
      i++;
	  }
	  for(i=1;i<=arr.length-1;i++)       //adds the used digits
	  {chksm1 = chksm1 + arr[i];
      i++;
	  }  
	  for(i=0;i<=arr.length-1;i++)       //adds the previous sum to the remaining digits
	  {chksm2 = chksm2 + arr[i];
		i++;  
	  }
	  if((chksm2+chksm1)%10 == '0')      //if the last digit of final sum is 0, checksum fails
		  return false;
	  else
		  return true;
	}
	
	String company(long[] arr)
	{ 
	if(arr.length==15 && ((arr[0]==3) && (arr[1]==4 || arr[1]==7)))
		return "Amex";
	else if(arr.length==16 && ((arr[0]==3) && (arr[1]==1 || arr[1]==2 || arr[1]==3 ||arr[1]==4||arr[1]==5)))
		return "MasterCard";
	else if((arr.length==13 || arr.length==16) && arr[0]==4)
		return "Visa";
	else return "not identifiable";
	}
  
  public static void main(String[] Ar)
	{ int i;
	long num;
	CreditCard card = new CreditCard();
	System.out.println("Enter your credit card number");
	Scanner sc = new Scanner(System.in);
	do
	{ num = sc.nextLong();
	  if(num>0)
		  break;
	}
	while(num>0);
	
	long[] arr = new long[card.digits(num)];
	long temp = num;
	for(i=0;i <= card.digits(num)-1;i++)
	{ 
      arr[i] = temp%10;
	  temp /= 10;
	}
	/*for(long j: arr)
	{System.out.println(j);   //to print the digits array
	*/
	if(card.checksum(arr))
		System.out.println("Checksum is valid"); //checksum validity
    System.out.println("The name of the company is "+card.company(arr));
}
}