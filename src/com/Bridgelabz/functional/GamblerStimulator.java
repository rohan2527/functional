package com.Bridgelabz.functional;

import java.util.Scanner;

public class GamblerStimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter stake amount=");
Scanner sc=new Scanner(System.in);
int stake=sc.nextInt();
System.out.println("enter Goal amount=");
int goal=sc.nextInt();
int win=0,loss=0,trial=0;
while(stake>0&&stake<goal)
{
	double random=Math.random();
	if(random<0.5)
	{
		win++;
		stake++;
	}
	else
	{
	loss++;
	stake--;
	}
trial++;
		
}
System.out.println("number of wins :"+win);
System.out.println("number of loss :"+loss);
System.out.println("number of trails :"+trial);

System.out.println("percentage  of wins :"+((float)win/trial)*100);
System.out.println("number of loss :"+((float)loss/trial)*100);



	}

}
