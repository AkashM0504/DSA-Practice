package Sorting_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {
	public static void main(String[] args) {
		int[] arr= {5,8,1,9,3,4,2};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
