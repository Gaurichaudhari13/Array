package com.jsp.array;

//insert 5 values using scanner
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {

			System.out.println("enter no");
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}
}
