import java.util.*;
class SumOfArray
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Inser the array elements");
		int a[]=new int[5];
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=in.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum of the array elements :"+sum);
	}
}
