package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class BinarySearchString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility utility=new Utility();
		System.out.println("enter number of words=");
	int n=sc.nextInt();
	String[] s=new String[n];

		System.out.println("enter words=");
		for( int i=0;i<n;i++)
		{
			s[i]=sc.next();
			
		}
		System.out.println("enter word you want to search=");
		String c=sc.next();
		if(utility.binarysearchString(s,c))
		{
			System.out.println("*word is found*");
			}
			else
				System.out.println("*word is not found*");

		}

	}


