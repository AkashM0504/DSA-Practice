public class Linear_search {
	public static void main(String[] args) {
		int[] arr= {10,20,30,15,25,45,40,50};
		int target=25;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("The target value is present in index "+i);
			}
		}
	}
}
