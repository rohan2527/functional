package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        Utility utility=new Utility();
	        int[] binary=new int[8];
	        int[] swap=new int[8];

	        System.out.println("enter number : ");
	        int n=sc.nextInt();
	        binary=Utility.toBinary(n);
			 System.out.print("Binary number is : ");
	        for(int i=7;i>=0;i--)
	        {
	        	System.out.print(binary[i]);
	        }
	       swap=utility.swapNibbles(binary);
	       System.out.println();
	        System.out.print("binary number after swapping : ");
	        for(int i=0;i<=7;i++)
	        {
	        	System.out.print(swap[i]);
	        }
	        System.out.println();
	        double decimal=utility.toDecimal(swap);
	        System.out.println("decimal number after swapping :"+decimal);

	}

}
