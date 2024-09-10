class Slargest
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50,50};
		int slargest=0;
		int largest=0;

		for(int i=0;i<a.length;i++)
		{
			if(largest<a[i])
			{

				slargest=largest;
				largest=a[i];
			}


		}
          System.out.println("Second Largest Elemwnt is " + slargest);
          System.out.println("Largest Elemwnt is " + largest);

	}
}