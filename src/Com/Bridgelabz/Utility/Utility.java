package Com.Bridgelabz.Utility;

import java.util.Arrays;
import java.util.Scanner;

public class Utility {

	public static void flipcoin(int n) {
		// TODO Auto-generated method stub
		float head=0,tail=0;
		 for (int i=1;i<=n;i++)
		 {
		 double a=  Math.random();
		 
		if (a>0.5)
		{	
			head++;
				}
		else
		{	
			tail++;
					} }
		 System.out.println("head count"+head);
			System.out.println("tail count"+tail);
			float phead=(head/n)*100;
			float ptail=(tail/n)*100;
			System.out.println("head percantage="+phead);
		System.out.println("tail percantage="+ptail);

	}


	public static float harmonicnumber(float n) {
		// TODO Auto-generated method stub
		float sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/(float)i);
		}
	    return sum;
		
	}


	public static int coupon(int n) {
		// TODO Auto-generated method stub
		boolean[] check=new boolean[n];
		int count=0;
		int distinct=0;
		while(distinct<n)
		{
		int random=(int)(Math.random()*n);
		count++;
		if(!check[random])
		{
			check[random]=true;
			distinct++;
		}
		
	}

		return count;
}


	public boolean binaryString;


	public void enterMatrixData(Scanner scan, int[][] m, int a, int b) {
		// TODO Auto-generated method stub
	     System.out.println("Enter Matrix Data");
         
         for (int i = 0; i < a; i++)
         {
             for (int j = 0; j < b; j++)
             {
                 m[i][j] = scan.nextInt();
             }
         }

	}


	public void printMatrix(int[][] matrix, int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Your Matrix is : ");
        
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }					
	}


	public int triples(int[] a,int n) {
		// TODO Auto-generated method stub
		int count=0;
	for(int i=0;i<n-2;i++)
{
	for(int j=i+1;j<n-1;j++)
	{
		for(int k=j+1;k<n;k++)
		{
			if(a[i]+a[j]+a[k]==0)
			{
				System.out.println(a[i]+","+a[j]+","+a[k]);
				count++;
			}
				
		}
	}
}
		return count;
	}


	public void permute(String s, int i, int l) {
		// TODO Auto-generated method stub
		if(i==l)
		{
			System.out.println(s);
		}
		else
		{
			for(int j=i;j<l;j++)
			{
			s=swap(s,i,j);	
			permute(s,i+1,l);
			}
			
		}
	}


	public String swap(String s, int i, int j) {
		// TODO Auto-generated method stub
	char[] c=s.toCharArray();
char temp=c[i];
	c[i]=c[j];
	c[j]=temp;
	return String.valueOf(c);		
		}


	public void Primefactors(int n) {
		// TODO Auto-generated method stub
		while(n%2==0)
		{
			 
		System.out.println(2);
		n=n/2;
		}
	
		for(int i=3;i<=Math.sqrt(n);i=i+2)
		{
		while(n%i==0)
		{
			System.out.println(i);
			n=n/i;
		}
		}
		 if (n > 2) 
           System.out.print(n); 	
		
	}


	public static void quadratic(int a, int b, int c) {
		// TODO Auto-generated method stub
		double x1,x2;
		double delta=(b*b)-(4*a*c);
		if (delta>0)
		{
		 x1= ((-b+Math.sqrt(delta))/2*a);
		 x2= ((-b-Math.sqrt(delta))/2*a);
		
		System.out.println("first root x1="+x1);
	
		System.out.println("second root x2="+x2);
		}//System.out.format("root1 = and root2 = "+x1 , +x2);
		else if(delta==0)
	   { x1= x2 = -b / (2 * a);
		System.out.println("first root x1="+x1);
		
		System.out.println("second root x2="+x2);
		}
		else
		{
        double realpart = (-b) / (2 *a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
        System.out.format("root1 = "+realpart+"+"+imaginaryPart+"  root 2="+realpart+"+"+imaginaryPart);
	}	
	}


	public static double windchill(float t, float v) {
		// TODO Auto-generated method stub
		double w=35.75+0.6215+((0.4275*t)-35.75)*Math.pow(v,0.16);
		
		return w;
		}


	public static boolean stringanagram(String s1, String s2) {
		// TODO Auto-generated method stub
		int l1=s1.length();
		int l2=s2.length();
		char[] st1=s1.toCharArray();
		char[] st2=s2.toCharArray();
	Arrays.sort(st1);
	Arrays.sort(st2);

		if (l1!=l2)
		{
			return false;
		}
		
		
			for(int i=0;i<l1;i++)
			{
				if (st1[i]!=st2[i])
				
					return false;
					}
				return true;	
	}


	public boolean primerange(int i)
	{
		// TODO Auto-generated method stub
		int count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
			count++;
		}
		}
		if(count<3)
		{
			return true;
		}
	
		return false;
	}


	public boolean palindrome(int i) {
		// TODO Auto-generated method stub
	int rev=0;
	int temp=i;
	while(i>0)
	{
		int rem=i%10;
		rev=(rev*10)+rem;
		i=i/10;
	}
	if(temp==rev&&temp>10)
	{
		return true;
	}
	else
		return false;
	}


	public int[] bubblesort(int[] a) {
		// TODO Auto-generated method stub
		
		int temp; 
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
					
				}
			}
		}
		return a;
	}


	public boolean binarysearch(int[] a, int number) {
		// TODO Auto-generated method stub
		int low=0;
		int high=a.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if (a[mid]==number)
			{
				return true;
			}
			else if(number<a[mid])
				high=mid-1;
			else
				low=mid+1;
		}
		return false;
		}


	


	public void search(int n) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int low=0;
		int mid;
		int high=n;
		try {
		    Thread.sleep(10 * 1000);
		} catch (InterruptedException ie) {
		    Thread.currentThread().interrupt();
		}
		while(low<=high)
		{	
			mid=(low+high)/2;
			System.out.println("is your number="+mid);
			System.out.println("enter '0' for yes '1'for no");
			int s1=sc.nextInt();
			if(s1==0)break;
			
			else if(s1==1)
				{
				System.out.println("is your number below "+mid+" or above "+mid);
				
				System.out.println("enter '0' for below "+mid+" and '1'for above "+mid);
				int s2=sc.nextInt();
				if(s2==0)
				{
					high=mid-1;
					
				}
				if(s2==1)
					{
					low=mid+1;
					}
				}
			else
			{
				System.out.println("you entered wrong number");
				break;
			}

				}
	}


	public String[] stringsort(String[] arr, int n) 
	{

		String temp; 
		  
        // Sorting strings using bubble sort 
        for (int i= 0; i< n - 1; i++) 
        { 
            for (int j = i + 1; j < n; j++)  
            { 
                if (arr[i].compareTo(arr[j]) > 0) 
                { 
                    temp = arr[j]; 
                    arr[j] = arr[i]; 
                    arr[i] = temp; 
                } 
            } 
        }
		return arr; 
	}


	public boolean binarysearchString(String[] s, String c) {
		// TODO Auto-generated method stub
		int n=s.length;
		s=stringsort(s,n);
		 int l = 0, h = n - 1; 
	        while (l <= h) 
	        { 
	            int m = l + (h - l) / 2; 
	  
	            int res = c.compareTo(s[m]); 
	  
	            // Check if x is present at mid 
	            if (res == 0) 
	            {
	            	return true; 
	            }
	  
	            // If x greater, ignore left half 
	            else if(res > 0) 
	                {
	            	l = m + 1; 
	                }
	  
	            // If x is smaller, ignore right half 
	            else
	                {
	            	h = m - 1; 
	                }
		}

		return false;
	}


	public int[] insertionsortint(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=1;i<n;i++)
		{
			int value=a[i];
			int hole=i;
			while(hole>0&&a[hole-1]>value)
				{
				a[hole]=a[hole-1];
				hole=hole-1;
			}
			a[hole]=value;
		}
			return a;
	}


	public String[] insertionsortstring(String[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=1;i<n;i++)
		{
		String value=a[i];
		int hole=i;
		int comp=a[hole-1].compareTo(value);
		while(hole>i&&comp>0);
		{
			a[hole]=a[hole-1];
			hole=hole-1;
			comp=a[hole].compareTo(value);

		}
		a[hole]=value;
		}
		return a;
	}

}	












