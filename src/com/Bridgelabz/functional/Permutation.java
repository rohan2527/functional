package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
	System.out.println("Enter word ");
String s=sc.nextLine();
int l=s.length();
u.permute(s,0,l);
	}

}
