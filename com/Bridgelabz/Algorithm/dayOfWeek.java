package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class dayOfWeek {

	public static void main(String[] args) 
	{// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s[]= {"sunday","monday","tuesday","Wednesday","thursday","friday","saturday"};
		Utility utility=new Utility();
		System.out.println("enter date ,month,year=");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		int a=utility.dayofweek(d,m,y);
		System.out.println(s[a]);
	}

}
