package com.bridgelabz.basiccore;
import java.util.Scanner;
public class Harmonic {
	Scanner scan= new Scanner(System.in);
    int inputNumber() {
    	System.out.println("Enter the number greater than 0");
    	int number=scan.nextInt();
    	return number;
    }
    double result(int number) {
    	double output=1;
    	for(int i=2;i<=number;i++) {
    		output=output+1/(double)i;
    	}
    	return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Harmonic obj=new Harmonic();
    int number=obj.inputNumber();
    while(true) {
    	if(number<=0) {
    		number=obj.inputNumber();
    	    	
    	}
    	else {
    		System.out.println("The harmonic sum is :"+ obj.result(number));
    		break;
    	}
    }
	}

}
