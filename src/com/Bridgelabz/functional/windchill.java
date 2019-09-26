package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utlity=new Utility();
		System.out.println("enter temperature (in Fahrenheit)=");
		float t=sc.nextFloat();
		System.out.println("enter speed v (in miles per hour)=");
        float v=sc.nextFloat();
        double w=(Utility.windchill(t,v));
		System.out.println("windchill="+w);
	}

}
