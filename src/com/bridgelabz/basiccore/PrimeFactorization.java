package com.bridgelabz.basiccore;

import java.util.Scanner;

public class PrimeFactorization {
	Scanner scan = new Scanner(System.in);

	int inputNumber() {
		System.out.println("Enter the positive integer ");
		int number = scan.nextInt();
		return number;
	}

	void primeFactor(int number) {
		System.out.println("The prime factors are : ");
		int p = number;
		for (int i = 2; i * i <= number; i++) {

			int track = 0;
			while (p % i == 0) {
				if (track == 0) {
					System.out.println(i);
					
				}
				track = i;
				p = p / i;
			}
		}
		if (p == number) {
			System.out.println(number);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeFactorization obj = new PrimeFactorization();
		int number = obj.inputNumber();
		while (true) {
			if (number == 1 || number == 0) {
				System.out.println(number + " has no prime factor");
				break;
			} else if (number < 0) {
				number = obj.inputNumber();

			} else {
				obj.primeFactor(number);
				break;
			}
		}
	}

}
