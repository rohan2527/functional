package com.Bridgelabz.Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class TicTacToe {

	public static void main(String[] args) 
	{int player=1;
		boolean[][] check =new boolean[3][3];
		char[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();

		}
		for(int i=0;i<=9;i++)
		{player =player*-1;
		Scanner sc = new Scanner(System.in);
        Utility utility=new Utility();
      utility.showInstruction(a);
      utility.takeInput(a,player);
      utility.checkWin(a);
		}
	}

}
