package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
System.out.println("enter 0 to start and 1 to stop");
int a=sc.nextInt();
int b = 0;
long  start=0,end=0;
if(a==0)
	{
	 start = System.currentTimeMillis();
	}
int a1=sc.nextInt();
if(a1==1)
	{
	 end = System.currentTimeMillis();
	}
float sec = (end - start) / 1000F; 
System.out.println(sec + " seconds");
	   }
}

