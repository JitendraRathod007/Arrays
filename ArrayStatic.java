class ArrayStatic
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,60,70,80};
		int b[]={10,20,30,40,50,60,70};
		//System.out.println(a.length);
		for(int i=0;i<=a.length;i++)

		System.out.println(a[i]+"\t\t"+b[i]);


		System.out.println(a==b);
	}
}