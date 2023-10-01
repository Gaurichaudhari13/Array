package com.jsp.array;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = {20,45,12,63,45};
		int key = 63;
		int low = 0;
		int high = a.length-1;

		while(low<=high) {
			int mid = (low+high)/2;
			if(a[mid]==key) {
				System.out.println("Value present at place:" + mid);
				break;
			}else if(a[mid]>key) {
				high = mid-1;
			}
			else if(a[mid]<key){
				low = mid+1;
			}
		}

	}

}
