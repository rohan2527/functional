package com.Bridgelabz.functional;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
        Utility utility=new Utility();
        System.out.println("Enter The Number Of Matrix Rows");
         
        int a = scan.nextInt();
         
        System.out.println("Enter The Number Of Matrix Columns");
         
        int b = scan.nextInt();
         
        //defining 2D array to hold matrix data
        int[][] matrix = new int[a][b];
        // Enter Matrix Data
        utility.enterMatrixData(scan, matrix, a, b);
        
        // Print Matrix Data
        utility.printMatrix(matrix, a, b);	}

}
