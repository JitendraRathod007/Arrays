class PrimeNo
{
	public static void main(String args[])
	{
		int n=13;
		for(int i=2;i<n;i++)
		{
			while(n%i==0)
			{
				System.out.println(n+"this is not prime");
				break;
			}
		if(i==n)
		System.out.println(n+"prime no");
	}
	}
}