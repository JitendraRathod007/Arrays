import java.util.*;
class ReverseOfArrayIndex
{
	public static void main(String args[])
	{
		int a[]={374,978,45,6745,768};
		for(int i=0;i<a.length;i++)
		{
			int rev=0;
			while(a[i]!=0)//374
			{
				rev=rev*10+a[i]%10;
				a[i]=a[i]/10;
			}
			a[i]=rev;
		}
		System.out.print(Arrays.toString(a));
	}
}