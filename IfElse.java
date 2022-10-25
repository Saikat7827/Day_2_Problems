package com.bridgelabz;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter single digit number:");
		String[] array = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		int a = sc.nextInt();
		if (a < 10) {
			while (a != 0) {
				System.out.println("You have entered number:" + array[a]);
				a = sc.nextInt();

			}
			System.out.println("Program " + array[a]);

		} else {
			System.out.println("not allow");

		}

	}
}
