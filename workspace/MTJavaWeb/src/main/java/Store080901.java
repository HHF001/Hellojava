public class Store080901 {
  String productType;
  
  public Store080901(String product) {
    productType = product;
  }
  
  public void advertise() {
	    String message = "Selling " + productType + "!";      //message�Ƿ����ڶ���ı������������޷�����
			System.out.println(message);
	  }
	  
	  // main method
	  public static void main(String[] args) {
	    String cookie = "Cookies";
	    Store080901 cookieShop = new Store080901(cookie);
	    
	    cookieShop.advertise();
	    //System.out.println(message);                       //message�Ƿ����ڶ���ı������������޷�����
	  }
	}