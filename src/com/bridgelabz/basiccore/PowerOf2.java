package com.bridgelabz.basiccore;
import java.util.Scanner;
public class PowerOf2 {
    Scanner scan= new Scanner(System.in);
    int inputNumber() {
    	System.out.println("Enter the number between 0 and less than 31");
    	int number=scan.nextInt();
    	return number;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     PowerOf2 obj = new PowerOf2();
     int number=obj.inputNumber();
     while(true) {
    	 if(number<0 || number>=31) {
    		 number=obj.inputNumber();
    	 }
    	 else {
    		 for(int i=0;i<=number;i++) {
    			
    			 System.out.println((int)Math.pow(2,(double)i));
    		 }
    		 break;
    	 }
     }
	}

}
