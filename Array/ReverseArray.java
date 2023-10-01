package com.jsp.array;

//reverse a string in array
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		String rev = "0";
		String a[] = { "a", "b", "c" };

		for (int i = 0; i < a.length; i++) {
		}
		for (int i = a.length - 1; i >= 0; i--) {
			rev = a[i];
			System.out.println(rev);
		}
	}

}
