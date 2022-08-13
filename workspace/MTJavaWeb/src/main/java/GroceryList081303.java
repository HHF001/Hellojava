public class GroceryList081303 {
	               //���һ��Ԫ�ػ��õ���һ��λ�ã���������Ԫ�غ���
	public static void diaoXu(String[] alist) {
		if(alist.length > 1) {
		String lastList = alist[alist.length-1];
		for(int i = 0;i < alist.length;i++) {
			String temp = alist[i];
			alist[i] = lastList;
			lastList = temp;
		}
	}
  }		
	                  //������ǰ������Ԫ�ط�������
	 public static void reverseGroceries(String[] groceryList) {
		    int j = groceryList.length - 1;
		    for (int i = 0; i < groceryList.length/2; i++) {
		      String temp = groceryList[i];
		      groceryList[i] = groceryList[j];
		      groceryList[j] = temp;
		      j--;
		    }
		  }
	            //�ж����������Ƿ�����ͬԪ��
	public static boolean isChongFu(String[] oneList,String[] twoList) {
		for(int i =0;i < oneList.length;i++) {
			for(int j = 0;j < twoList.length;j++) {
				if(oneList[i]== twoList[j]) {
					return true;
				}
			}
		}
		return false;
	}
	           //�ж��������Ƿ�����ͬ��Ԫ�أ����ִ�Сд��
	  public static boolean hasDuplicates(String[] groceryList) {
		    for (int i = 0; i < groceryList.length - 1; i++) {
		      for (int j = i + 1; j < groceryList.length; j++) {
		        if (groceryList[i] == groceryList[j]) {
		         return true; 
		        }
		      }
		    }
		 
		    return false;
		  }
               //������Ԫ������ĸ�ǲ��ǰ��������е�
	 public static boolean isAlphabetized(String[] groceryList) {
		    if (groceryList.length > 1) {
		      String lastGroceryItem = groceryList[0];
		 
		      for (int i = 1; i < groceryList.length; i++) {
		        if (lastGroceryItem.compareTo(groceryList[i]) > 0) {
		          return false;
		        }
		 
		        lastGroceryItem = groceryList[i];
		      }
		    }
		 
		    return true;
		  }
	     //�ж��������Ƿ���Ԫ����0.99��β���Ƿ���true���񷵻�false
	public static boolean hasSpecialItem(double[] groceryPrices) {
	    for (double itemCost : groceryPrices) {
	      String itemCostStr = String.valueOf(itemCost);
	      if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
	        return true;
	      }
	    }
	 
	    return false;
	  }
	      //�������
	public static double getTotalCost(double[] groceryPrices) {
    double totalCost = 0.0;
    for (double i : groceryPrices){
      totalCost += i;
    }
    return totalCost;
  }
	   //�ҳ��������ַ�������5��Ԫ������
	public static int getNum(String[] groList) {
		int numAll = 0 ;
		for(String gro: groList) {
			if(gro.length() > 5) {
				numAll++;
			}
		}
		return numAll;
	}
	     //������������������
  public static double getMostExpensiveItemCost(double[] groceryPrices) {
	    //�������һ��Ԫ�ؿ�ʼ�����е�Ԫ�رȽϴ�С
	    double maxCost = groceryPrices[0];
	    for (double itemCost : groceryPrices){
	      if(maxCost < itemCost){
	        maxCost = itemCost;
	      }
	    }
	    return maxCost;
	  }
  public static void main(String[] args) {
    // Below are some sample values you can use to run your code.
    // 
    double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
     System.out.println(getTotalCost(groceryPrices));
    
    double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
     System.out.println(getTotalCost(unlikelyGroceryPrices));
     
     double[] groceryPrices1 = {10.0, 12.3, 8.45, 2.34};
     System.out.println(getMostExpensiveItemCost(groceryPrices));
     
     String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};
     System.out.println(getNum(groceryList));
     
     double[] groceryList2 = {10.0, 89.9, 8.99, 2.34};
     System.out.println(hasSpecialItem(groceryList2));
     
     String[] groceryList3 = {"apples", "banana", "bananas", "chocolate"};
     System.out.println(isAlphabetized(groceryList3));
     
     String[] groceryList4 = {"apples", "banana", "Apples", "chocolate"};
     System.out.println(hasDuplicates(groceryList4));
     
     String[] groceryList5 = {"apples", "banana", "Apples", "chocolate"};
     String[] groceryList6 = {"apple", "milk", "bananaR", "bananas", "chocolateR"};
     System.out.println(isChongFu(groceryList5,groceryList6));
     
     String[] groceryList7= {"1", "2", "3", "4"};
     reverseGroceries(groceryList7);
     for (String item : groceryList7) {
       System.out.println(item);
     }
     System.out.println("--------------------");
     
     String[] groceryList8 = {"2", "3", "4", "1"};
     diaoXu(groceryList8);

     for (String item : groceryList8) {
       System.out.println(item);
     }
  }
}