package Sorting_Algorithm;

import java.util.Arrays;

class Insertion{
	public void sorting(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println(Arrays.toString(arr));
	}
}
public class Insertion_Sort {
	public static void main(String[] args) {
		Insertion i=new Insertion();
		int[] arr= {7,2,4};
		i.sorting(arr);
	}
}
