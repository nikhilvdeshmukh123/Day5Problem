package com.bridgelabz.basiccore;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the integer");
     int a= scan.nextInt();
     if(a%2==0) {
    	 System.out.println("This is an Even number");
     }
     else {
    	 System.out.println("This is an odd number");
     }
     
	}

}
