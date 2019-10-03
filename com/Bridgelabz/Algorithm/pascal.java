package com.Bridgelabz.Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pascal {

	static int factorial(int n) {
	      int f;

	      for( f = 1; 1 < n; n--)
	      {
	         f =f* n;
	      }
	      return f;
	   }
	   static int ncr(int n,int r) {
	      return factorial(n) / ( factorial(n-r) * factorial(r) );
	   }
	   public static void main(String args[]){
	      System.out.println();
	      int n, i, j;
	      n = 5;

	      for(i = 0; i < n; i++) {
	         for(j = 0; j <= n-i; j++)
	         {
	            System.out.print(" ");
	         }
	         for(j = 0; j <= i; j++)
	         {
	            System.out.print(" "+factorial(i) / ( factorial(i-j) * factorial(j)));;
	         }
	         System.out.println();
	      }
	   }
		
		}

