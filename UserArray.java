import java .util.*;
class UserArray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter the element in the array");

		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
		}

		System.out.println("Here array elements are");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
	   }


	}
}