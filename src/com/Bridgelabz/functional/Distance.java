package com.Bridgelabz.functional;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter co-ordinates");
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
double res=(Math.pow(x,2)+Math.pow(y, 2));
System.out.println(" Euclidean distance="+Math.sqrt(res));
	
	}
}
