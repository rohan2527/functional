package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Desc -> Given N distinct Coupon Numbers,
//		how many random numbers do you need to generate distinct coupon number?
//				This program simulates this random process.
//				I/P -> N Distinct Coupon Number
//				Logic -> repeatedly choose a random number and
//				check whether it's a new one.
//				O/P -> total random number needed to have all distinct numbers.
//				Functions => Write Class Static Functions to 
//				generate random number and to process distinct coupons.
System.out.println("enter coupon numbers");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
Utility utility=new Utility();
int c=utility.coupon(n);
System.out.println(c);

	}

}
