package com.bridgelabz.basiccore;
import java.util.Scanner;
public class VowelConsonent {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the alphabet :");
     char c = scan.next().charAt(0); 
     char[] list= {'a','e','i','o','u','A','E','I','O','U'};
     int track=0;
     for(char i:list) {
    	 if(i==c) {
    		 System.out.println("The alphabet is vowel");
    		 track=1;
    		 break;
    	 }
     }
     if(track==0) {
    	 System.out.println("The alphabet is consonent");
     }
	}

}
