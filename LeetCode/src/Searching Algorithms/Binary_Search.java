package Searching_Algorithm;

class Logic{
	public static int main_Logic(int arr[], int target, int low, int high) {
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]>target)
				high= mid-1;
			else
				low=mid+1;
		}
		return -1;
	}
}
public class Binary_Search {
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70};
		int low=0;
		int high=arr.length-1;
		int target=60;
		
		Logic l=new Logic();
		System.out.println(l.main_Logic(arr, target, low, high));
	}
}
