import java .util.*;
class AvgOfArray
{
	public static void main(String args[])
	{
	     Scanner in =new Scanner(System.in);
	     int a[]=new int[5];
	     int sum=0;
	     float avg;
	     System.out.println("insert elements in array");
	     for(int i=0;i<a.length;i++)
	     {
			 a[i]=in.nextInt();
			 sum=sum+a[i];


			 avg=sum/a.length;

		 System.out.println("Avg of arra are:"+avg);
	 }
 }