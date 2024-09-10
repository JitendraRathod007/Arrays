class PalindromNo
{
	public static void main(String args[])
	{
		int n=121,rev,sum=0;
		int temp=n;
		while(n!=0)
		{
			rev=n%10;
			sum=sum*10+rev;
			n=n/10;
		}
		if(temp==n)
			System.out.println(n+"this is palindrom");

	 }
 }
