class Prac1A
{
	public static void main(String args[])
	{
		int a[]={14,25,18,23,24,30,12,28,16,22,26};
		for(int i=0;i<a.length;i++)
		{

		if(a[i]%4 ==0 && a[i]%6!=0)
		{
			a[i]=-1;
		}
		else if(a[i]%6==0 && a[i]%4!=0)
		{
			a[i]=-2;
		}
		else if(a[i]%4==0 && a[i]%6==0)
		{
			a[i]=-3;
		}
	System.out.print(a[i]+"\t");
}
}

}