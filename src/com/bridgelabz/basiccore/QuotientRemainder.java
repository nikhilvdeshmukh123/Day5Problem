package com.bridgelabz.basiccore;
import java.util.Scanner;

public class QuotientRemainder {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the dividend");
    int dividend=scan.nextInt();
    System.out.println("Enter the divisor:");
    int divisor=scan.nextInt();
    System.out.println("The quotient is "+dividend/divisor+" and the remainder is "+ dividend%divisor);
	}

}
