package com.jsp.array;

public class selectionsSort {
	public static int[] selectionSort(int a[]) {
		for(int i = 0;i<a.length-1;i++) {
			for(int j = i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}


		return a;
	}
	public static void main(String[] args) {
		int a[] = {10,25,90,60,25,85};
		int res[] = selectionSort(a);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}

}
