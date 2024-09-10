class DuplicateElement
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,30,40,50,30,10};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)

				if(a[i]==a[j])

			System.out.println(a[i]);
		}
	}
}