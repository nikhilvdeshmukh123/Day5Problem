package com.bridgelabz.basiccore;
import java.util.Scanner;
public class Swap {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number a:");
    int a=scan.nextInt();
    System.out.println("Enter the number b:");
    int b=scan.nextInt();
    int c=a;
    a=b;
    b=c;
    System.out.println("The swapped numbers are a= "+a+" and b= "+b);
    
	}

}
