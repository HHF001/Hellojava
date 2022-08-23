import java.util.ArrayList;

class Total082304 {

  public static int getTotal(ArrayList<Integer> arr) {
    // Add code below
	  
    if(arr.size() == 0) {
    	return 0;
    }else {
    	int m = arr.get(0);
    	return getTotal(arr.remove(0))+ m;
    }
    
    
  }

  private static Integer getTotal(Integer remove) {
	// TODO Auto-generated method stub
	return null;
}

public static void main(String[] args) {
    ArrayList<Integer> myArrayLs = new ArrayList<Integer>();
    myArrayLs.add(3);
    myArrayLs.add(5);
    myArrayLs.add(6);
    myArrayLs.add(9);
  
    int total = getTotal(myArrayLs);
    System.out.println(total);
  }
}