package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class Triples{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
System.out.println("enter lenth of array=");
int n=sc.nextInt();
int[] a=new int[n];
System.out.println("enter numbers");

for(int i=0;i<n;i++)
{
    a[i]=sc.nextInt();

}
int count=u.triples(a,n);
System.out.println("Number of triples="+count);

	}

}
