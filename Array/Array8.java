package com.jsp.array;

//find average
public class Array8{

	public static void main(String[] args) {
		int sum = 0;
		int a[] = { 45, 56, 52, 10 };
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("average value is:" + sum / a.length);
	}

}
