package com.mahedi;

import java.util.Scanner;

public class Plus_One_66 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = input.nextInt();
		}
//		arr[n]=0;
//		System.out.println(arr[n]);
		if (arr[n - 1] < 9) {
			arr[n - 1] = arr[n - 1] + 1;
			int i=0;
			System.out.print("["+arr[0] + ",");
			for ( i = 1; i < n-1; i++) {
				System.out.print(arr[i] + ",");
			}
			System.out.print(arr[i] + "]");
//			return;
		}

		else {
		n++;
		int brr[] = new int[n];
		brr[n - 1] = 0;
		brr[n - 2] = 1;
		System.out.print("["+arr[0] + ",");
		for (int i = 0; i < n; i++) {
			System.out.print(brr[i] + ",");
		}
		}
//		n++;
////		System.out.print(n);
//		int brr[] = new int[n];
//		brr[n - 1] = 0;
//		brr[n - 2] = 1;
//
//		for (int i = 0; i < n; i++) {
//			System.out.print(brr[i] + ",");
//		}
//		n=n+1;
//		arr[n-1]=0;
//		System.out.println(arr[n-1]);
//		for(int i=0;i<n+1;i++) {
//			arr[i]=input.nextInt();
//		}
//		
//		int l=0;
//		for(int j=0;j<n;j++) {
//			l=(l*10)+arr[j];
//		}
//		l++;
//		System.out.println(l);
////		int brr[]=new int[n]
//		int i=0;
//		while(l>0) {
//			arr[i]=l%10;
//			System.out.println(l%10);
//			l=l/10;
//			i++;
//		}
//		for(int j=arr.length-1;j>=0;j--) {
//			System.out.print(arr[j]+",");
//			
//		}

	}

}
