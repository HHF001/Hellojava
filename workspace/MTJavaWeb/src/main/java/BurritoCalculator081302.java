public class BurritoCalculator081302 {
	   //����ǰ�������෴
	public static int get(int number) {
		 int newNumber = 0;
		 while(number  > 0) {
			 newNumber = (newNumber*10)+ (number%10);
			 number = number / 10;
		 }
		 return newNumber;
	 }
	     //��������������*900
	/*public static int getTip(int budget) {
	     int maxDigit = 0;
	 
	  while (budget > 0) {
	    int digit = budget % 10;
	    if (digit > maxDigit) {
	      maxDigit = digit;
	    }
	 
	     budget /= 10;
	  }
	  return maxDigit * 900;
	  }*/
	          // ���������������ܱ�9��������������
	/*public static int getBurritosSold(int lastOrderNumber) {
   int totalBurritosSold = 0;
 
  for (int i = 0; i <= lastOrderNumber; i++) {
    if(i%9 == 0) {
    	totalBurritosSold++;
    }
  }
 
  return totalBurritosSold;
  }*/
    
  public static void main(String []args) {
    // ���������������ܱ�9��������������
    //System.out.println(getBurritosSold(548));
	  System.out.println(get(25687845));
  }
}
