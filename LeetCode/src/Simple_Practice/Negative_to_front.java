package Simple_Practice;

import java.util.Arrays;

public class Negative_to_front {
	public static void main(String[] args) {
		int[] arr= {-1,1,-2,2,3,-3,4,5,-4};
		int left=0;
		int right=arr.length-1;
		while(left<right) {
			if(arr[left]<0) {
				left++;
			}else if(arr[right]>0) {
				right--;
			}else {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
			}
		}
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
