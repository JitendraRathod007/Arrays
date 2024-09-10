class AvgOfOddEvenArray
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int count=0,cal=0;
		double avg=0,avg1=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				avg=avg+a[i];
				count++;
			}
			if(a[i]%2!=0)
			{
				avg1=avg1+a[i];
				cal++;
			}
		}
		avg=avg/count;
		avg1=avg1=cal;
		System.out.println(avg1);
		System.out.println(avg);
	}
}