package com.program;

import java.util.Arrays;

public class SecondLargestInArrayExample1 {
	public static void main(String[] args) {
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,6));  
		System.out.println("Second Largest: "+getSecondLargest(b,7));  
	}

	public static int getSecondLargest(int[] a, int n) {
		Arrays.sort(a);
		return a[n-2];
	}
}
