class AvgEvenOdd
{
	public static void main(String args[])
	{
		int a[]={17,21,18,10,14,11,16,15,22,12,13};

		double Oddavg=0;
		double Evenavg=0;
		int Evencount=0;

		for(int i=0;i<a.length;i++)
		{

		 if(a[i]%2==0)
			{
				Evenavg=Evenavg+a[i];
				Evencount++;
		    }
		    else
		    {
				Oddavg=Oddavg+a[i];
			}

		}
		Evenavg=Evenavg/Evencount;
		Oddavg/=a.length-Evencount;
		System.out.println(Evenavg);
		System.out.println(Oddavg);
	}
}