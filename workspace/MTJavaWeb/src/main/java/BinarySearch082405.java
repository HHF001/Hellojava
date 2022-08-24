public class BinarySearch082405{
  public static int binarySearch082405(int[] arr, int left, int right, int target){
	  if (left > right) {
	      return -1;
	    }
	    
	    int mid = left + (right - left) / 2;
	 
	    // Base condition (key value is found)
	    if (target == arr[mid]) {
	      return mid;
	    }
	 
	    // discard all elements in the right search space
	    // including the mid element
	    if (target < arr[mid]) {
	      return binarySearch082405(arr, left, mid - 1, target);
	    }
	 
	    // discard all elements in the left search space
	    // including the mid element
	     if (target > arr[mid]) {
	      return binarySearch082405(arr, mid + 1, right, target);
	    }
	   return 0;
	  }
  public static void main(String[] args)
  {
    int[] arr = { 2, 5, 6, 8, 9, 10 };
    int target = 9;
 
    int left = 0;
    int right = arr.length - 1;
 
    int index = binarySearch082405(arr, left, right, target);
   if (index != -1) {
      System.out.println("Element found at index " + index);
    } else {
      System.out.println("Element not found in the array");
    }
  }
 
}