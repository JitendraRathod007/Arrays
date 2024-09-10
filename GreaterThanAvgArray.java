class GreaterThanAvgArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int count=0;
		double avg=0;
		for(int i=0;i<a.length;i++)
		{
			avg=avg+a[i];
			count++;
		}
		avg=avg/count;
		System.out.println(avg);
		System.out.println(" element which is greater than avg");
		for(int i=0;i<=a.length;i++)
		{
			if(avg<a[i])
			{
				System.out.println(a[i]);
			}
	   }


	}
}
