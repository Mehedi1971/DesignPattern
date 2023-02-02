package Sorting_Algorithm;

import java.util.Scanner;
public class Selection_Sort_Algorithm {

	public static void selection_sort (int a, int arr[]) {
		for(int i=0;i<a;i++) {
			for(int j=i+1;j<a;j++) {
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
//		this is display
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
		selection_sort(a,arr);
	}

}
