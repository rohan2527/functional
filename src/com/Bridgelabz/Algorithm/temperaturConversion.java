package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class temperaturConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		int a;
		System.out.println("enter 1 for Celsius to Fahrenheit ");
		System.out.println("enter 2 for Fahrenheit to Celsius ");
		a=sc.nextInt();
		utility.temp(a);

	}

}
