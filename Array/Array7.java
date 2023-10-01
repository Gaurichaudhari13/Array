package com.jsp.array;

//create array of 5 floats and calculate their sum


public class Array7 {

	public static void main(String[] args) {
		float sum=0;
		float a[]= {45.7f,67.8f,63.4f,99.2f,100.0f};
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
			System.out.println("sum of float:"+sum);

	}

}
