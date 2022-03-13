package com.bridgelabz.functional;

import java.util.Scanner;
import java.util.Random;

public class Triplets {

	int[] makeArray(int n) {
		Scanner numbers = new Scanner(System.in);
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = numbers.nextInt();
		}
		return array;
	}

	int[][] checkTriplets(int[] array) {
		
		int index = 0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i+1; j < array.length - 1; j++) {
				for (int k = j+1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						index += 1;
					}
					

				}
			}
		}
		int[][] triplets=new int [index][3];
		int row=0;
		for (int i = 0; i < array.length - 2; i++) {
			for (int j =i+1; j < array.length - 1; j++) {
				for (int k =j+1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						triplets[row][0]=array[i] ;
						triplets[row][1]=array[j];
						triplets[row][2]=array[k];
						row+=1;
					}
					

				}
			}
		}
		return triplets;
	}
	void getTriplets(int [][] triplets) {
		if(triplets.length==0) {
			System.out.println("No triplets found");
		}
		else {
			for(int i=0;i<triplets.length;i++) {
	    		for(int j=0;j<triplets[i].length;j++) {
	    			System.out.printf("%d \t",triplets[i][j]);
	    		}
	    		System.out.println();
	    	}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Triplets obj = new Triplets();
		System.out.println("Enter the number of integers: ");
		int n = scan.nextInt(); ///// Ask for no of integers
		if (n < 3) {
			System.out.println("Triplet can't form");
		} else {
			System.out.println("Enter the integers: ");
			int[] array = obj.makeArray(n);
			int[][] triplets = obj.checkTriplets(array);
            obj.getTriplets(triplets);
		}

	}

}
