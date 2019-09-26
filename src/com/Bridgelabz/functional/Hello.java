package com.Bridgelabz.functional;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
String N=sc.nextLine();
String s= "hello "+N+",how are you ?";
int l=N.length();
if (l<=3)
{
	System.out.println("name should contain minimum 3 letters");
}
else
	System.out.println(s);

	}

}
