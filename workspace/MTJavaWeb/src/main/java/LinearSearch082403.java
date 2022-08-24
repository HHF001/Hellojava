public class LinearSearch082403{
	public static int LinearSearch082403(int[] arr,int target ) {
		for(int i = 0;i<arr.length;i++) {
			if(target == arr[i]) {
				System.out.println("Element is present at index _"+i);
				return 1;
			}
		}
			System.out.println("数组中不存在元素");
			return -1;
	
	}
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,10,10};
		int target = 7;
		LinearSearch082403(arr,target);
		System.out.println(LinearSearch082403(arr,target));
	}
}