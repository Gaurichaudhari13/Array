package com.jsp.array;


//reverse the array
public class Array5 {

	public static void main(String[] args) {
		int rev = 0;
		int a[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
		for (int i = a.length - 1; i >= 0; i--) {
			rev = a[i];

			System.out.println("rev of array" + rev);
		}
	}
}