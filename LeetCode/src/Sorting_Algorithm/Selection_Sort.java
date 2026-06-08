package Sorting_Algorithm;

import java.util.Arrays;

public class Selection_Sort {
	public static void main(String[] args) {
		int arr[]= {5,1,8,3,7,4,9};
		for(int i=0;i<arr.length-1;i++) { 
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minindex]) {
					minindex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
		System.out.println("Sorted");
		System.out.println(Arrays.toString(arr));
	}
}
