package com.bridgelabz.basiccore;
import java.util.Scanner;
public class LeapYear {
	Scanner scan = new Scanner(System.in);
     
	 int inputYear() {
		System.out.println("Enter the year: ");
		int  year= scan.nextInt();
		return year;  }
	 void checkYear(double year) {
		 if(year%4 ==0) {
			 if(year%100==0 && year%400!=0) {
				 System.out.println("It is not a leap year");
			 }
			 else{
				 System.out.println("It is leap year");
			 }
		 }
		 else {
			 System.out.println("It is not a leap year");
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LeapYear obj=new LeapYear();
     int year=obj.inputYear();
     while(true) {
    	 if(year/1000==0 || year/10000>=1) {
    		 System.out.println("Enter the year with 4 digits");
    		 year=obj.inputYear();
    	 }
    	 else {
    		 obj.checkYear(year);
    		 break;
    	 }
     }
	}

}
