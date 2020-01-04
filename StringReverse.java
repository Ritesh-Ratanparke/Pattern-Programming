import java.util.*;
class StringReverse
{
	public static void main(String[] Ar)
	{   Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
		String s = sc.nextLine();
		String temp = "";
		for(int i = s.length()-1; i >= 0 ;i--)
		{
		 temp += s.charAt(i);
		}
		System.out.print(temp);
	}			
}