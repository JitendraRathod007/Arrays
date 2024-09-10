 import java.util.*;
 class SumIndexOfArray
{
	public static void main(String args[])
	{
		int a[]={374,768,3524,12,8,90};
		for(int i=0;i<a.length;i++)
		System.out.print(a[i]+"\t");
		for(int i=0;i<a.length;i++)
		{
             int sum=0;
			while(a[i]!=0)//768
			{
				sum=sum+a[i]%10;
				a[i]=a[i]/10;
			}
			a[i]=sum;

		}
		System.out.println("sum of array index");
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
}
}