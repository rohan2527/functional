package Algorithm;

import Com.Bridgelabz.Utility.Utility;

public class PrimeRange 
	{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a=new int[168];
Utility u=new Utility();
int i,j;
int k=0;
for( i=2;i<=1000;i++)
{
	 if(u.primerange(i))
	 {
		a[k]=i;
		k++;
	 }
}
for(j=0;j<a.length;j++)
{
	if(u.palindrome(a[j]))
		System.out.println(a[j]);
}

//for (int element: a) 
//{
//    System.out.println(element);
//    }
//}
	
	}
}