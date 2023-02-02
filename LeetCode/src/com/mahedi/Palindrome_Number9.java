package com.mahedi;

import java.util.Scanner;

public class Palindrome_Number9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();	
		int a=n;
		int l = 0;
		while (n > 0) {
			int r = n % 10;
			l = (l * 10) + r;
			n = n / 10;
		}

		if (l == a) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}

	}

}
