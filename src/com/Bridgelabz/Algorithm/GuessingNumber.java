package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class GuessingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter number");
		int n=sc.nextInt();
		int N=(int)Math.pow(2, n)-1;
		System.out.println("think a number between 0 to "+N);
		
		utility.search(N);
		
	}

}
