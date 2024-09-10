import java.util.*;
class ArrayShiftLastElement
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int temp=a[0];
		System.out.println("before Swapping :"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
		a[i]=a[i+1];

		a[a.length-1]=temp;
      	}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}
}
