package com.jsp.array;

//sum of array

public class SumArray {

	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 1, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("sum of array is:" + sum);

	}
}
