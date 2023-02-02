package Sorting_Algorithm;

import java.util.Scanner;

public class Bubble_Sort {

	public static void bubble_sort(int a,int arr[]) {
		for(int i=0;i<a;i++) {
			for(int j=0;j<a-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				
			}
		}
		Display(a,arr);
		
	}
	public static void Display(int a,int arr[]) {
		for(int k=0;k<a;k++) {
			System.out.print(arr[k]+" ");
		}
	}
	
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	int a=input.nextInt();
	int arr[]=new int[a];
	
	for(int i=0;i<a;i++) {
		arr[i]=input.nextInt();
	}
	
	bubble_sort(a,arr);
	}

}
