package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class monthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter loan amount=");
		double p=sc.nextDouble();
		System.out.println("enter time to clear loan in years=");
		double y=sc.nextDouble();
		System.out.println("enter rate of intrest=");
		double r=sc.nextDouble();
		double mp=Utility.loan(p,y,r);
		System.out.println("monthly payment you would have to make in "+y+" years ="+mp);
	}

}
