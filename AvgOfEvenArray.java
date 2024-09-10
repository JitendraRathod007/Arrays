class AvgOfEvenArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40};
		double count=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				avg=avg+a[i];
				count++;
				System.out.println(a[i]);
			}
		}
		avg=avg/count;
		System.out.println(avg);
	}
}