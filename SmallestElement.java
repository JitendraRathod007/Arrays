class SmallestElement
{
	public static void main(String args[])
	{
		int a[]={10,20,30,9

		,40,50};
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(smallest>a[i])
			{
				smallest=a[i];
			}
		}

		System.out.println(smallest);
	}
}