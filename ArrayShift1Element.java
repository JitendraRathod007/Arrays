import java.util.*;
class ArrayShift1Element
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		System.out.println(Arrays.toString(a));
		System.out.println("array before swapping");
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+"\t");
	    }
	    System.out.println();
        System.out.println("after the swap");
	    int temp;
	    temp=a[0];
	    a[0]=a[a.length-1];
	    a[a.length-1]=temp;

	    for(int i=0;i<a.length;i++)
	    System.out.print(a[i]+"\t");


	}
}

