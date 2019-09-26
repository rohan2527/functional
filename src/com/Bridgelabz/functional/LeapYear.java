package com.Bridgelabz.functional;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int year;
		System.out.println("enter year");
		year=Sc.nextInt();
		if(year>999&&year<=9999)
		{
			if (((year%4==0)&&(year%100!=0))||(year%400==0))
		
		{
			System.out.println(+year+ " is leap year");
		}
		else
		{
			System.out.println(+year+ " is not leap year");
		}
	}
		else
			
			System.out.println("year should be four digit number.");

	}
}
