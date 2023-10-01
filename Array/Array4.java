package com.jsp.array;

//find largest no

public class Array4 {
	public static void main(String[] args) {
		int a[] = { 1, 2, 21, 15 };
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (largest < a[i]) {
				largest = a[i];

			}

		}
		System.out.println("Largest no is:" + largest);
	}
}