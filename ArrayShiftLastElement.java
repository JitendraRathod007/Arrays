import java.util.*;
class ArrayShiftLastElement
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int temp;
		System.out.println("before Swapping :"+Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			temp=a[a.length-1];
			a[a.length-1]=a[0];
			a[0]=temp;
			System.out.print(a[i]+"\t");
		}
	}
}
