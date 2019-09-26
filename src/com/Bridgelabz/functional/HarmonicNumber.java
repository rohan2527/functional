package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility utility=new Utility();
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		float n=sc.nextFloat();
		float Hn=Utility.harmonicnumber(n);
		System.out.println("nth harmonic number="+Hn);
	}

}
