import java.util.*;
class AddLengthLast
{
	public static void main(String args[])
	{
		int a[]={1264,436,3568,27};

		for(int i=0;i<a.length;i++)
		{
			int temp=a[i],power=0;

			while(temp!=0)
			{
				temp=temp/10;
				power++;
			}
			temp=power;
			while(temp!=0)
			{
				a[i]=a[i]*10;
				temp=temp/10;
		    }
		    a[i]=a[i]+power;
		}

			System.out.print(Arrays.toString(a)+"\t");
	}
}

