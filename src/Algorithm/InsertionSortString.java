package Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class InsertionSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Utility u=new Utility();
				Scanner sc=new Scanner(System.in);

				System.out.println("enter number of words you want sort ");
				
				int n=sc.nextInt();
		String a[]=new String[n];

			System.out.println("enter words ");
			for( int i=0;i<n;i++)
		{
			a[i]=sc.next();
		}
a=u.insertionsortstring(a);
System.out.println("Strings in sorted order are : "); 
for (int i = 0; i <n; i++) 
    System.out.println("word "+(i + 1) + " is " + a[i]);
	}
	}


