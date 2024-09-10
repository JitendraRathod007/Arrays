import java.util.Arrays;
class AddSumFirst
{
	public static void main(String args[])
	{
		int a[]={374,4367,287,469,357,22};
		for(int i=0;i<a.length;i++)
		{
			int sum=0,temp=a[i];
			while(temp!=0)
			{
				sum=sum+temp%10;
				temp=temp/10;
			}
			temp=a[i];
			while(temp!=0)
			{
				sum=sum*10;
				temp=temp/10;
			}
			a[i]=a[i]+sum;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+"\t");
		}
	}
}