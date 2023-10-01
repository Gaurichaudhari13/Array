package com.jsp.array;

public class BubbleSort {
	public static int[] bubbleSort(int a[]) {
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			}
		}


		return a;
	}
	public static void main(String[] args) {
		int a[] = {25,41,10,63,25};
		int res[] = bubbleSort(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}

}
