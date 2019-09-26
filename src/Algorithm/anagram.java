package Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		Utility utility=new Utility();
		String s1,s2;
	
		System.out.println("enter string 1=");
		s1=Sc.nextLine();
		System.out.println("enter string 2=");
		s2=Sc.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		if (Utility.stringanagram(s1,s2))
		System.out.println("strings are anagrams of each other");
		else
			System.out.println("strings are not anagrams of each other");

	}

}
