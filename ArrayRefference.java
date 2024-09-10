class ArrayRefference
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[4]=30;
		int b[]=a;
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]+"\t"+b[i]);
		System.out.println(a==b);
	}
}