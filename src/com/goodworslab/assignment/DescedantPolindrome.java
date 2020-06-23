package com.goodworslab.assignment;

import java.util.Scanner;

public class DescedantPolindrome {

	/*
	 * to find number is descend polindrome or not this methos returns boolean
	 * value
	 */
	public static boolean descendantPolin(int number) {
		boolean isBoolean = false;
		while (number > 9) {
			if (isPolindrome(number)) {
				isBoolean = true;
				break;
			}
			number = getSumOfDigits(number);
		}
		return isBoolean;
	}

	/*
	 * to tind wheater the number is polindrome or not this metos return boolean
	 * value
	 */
	public static boolean isPolindrome(int number) {
		int revNum = 0, num = number;
		if (num < 0)
			num = num * -1;
		while (num != 0) {
			revNum = revNum * 10;
			revNum = revNum + num % 10;
			num = num / 10;
		}
		return (revNum == number);
	}

	// to next child
	public static int getSumOfDigits(int n) {
		String isString = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < isString.length() - 1; i += 2) {
			int i1 = Integer.parseInt(Character.toString(isString.charAt(i)));
			int i2 = Integer.parseInt(Character.toString(isString.charAt(i + 1)));
			int number = i1 + i2;
			sb.append(Integer.toString(number));
		}
		return Integer.parseInt(sb.toString());
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		boolean descPolindromeResult = descendantPolin(number);
		System.out.println(number + " " + descPolindromeResult);
	}
}
