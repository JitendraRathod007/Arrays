class ShiftLast
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
		a[0]=a[0]+a[a.length-1];
		a[a.length-1]=a[0]-a[a.length-1];
		a[0]=a[0]-a[a.length-1];
	    }
	    for(int i=0;i<a.length;i++)

		System.out.print(a[i]+"\t");

	}
}