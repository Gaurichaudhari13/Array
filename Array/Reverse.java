package com.jsp.array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int rev = 0;
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {

			System.out.println("enter no");
			arr[i] = sc.nextInt();
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(rev);
		}

	}

}
