package com.Bridgelabz.functional;

import java.util.Scanner;

public class Powerof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int pow=1;
		for(int i=1;i<=n;i++)
		{
			pow=pow*2;
			System.out.println(pow);

		}
	}

}
