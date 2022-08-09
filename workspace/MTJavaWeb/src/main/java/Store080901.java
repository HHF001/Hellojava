public class Store080901 {
  String productType;
  
  public Store080901(String product) {
    productType = product;
  }
  
  public void advertise() {
	    String message = "Selling " + productType + "!";      //message是方法内定义的变量，方法外无法调用
			System.out.println(message);
	  }
	  
	  // main method
	  public static void main(String[] args) {
	    String cookie = "Cookies";
	    Store080901 cookieShop = new Store080901(cookie);
	    
	    cookieShop.advertise();
	    //System.out.println(message);                       //message是方法内定义的变量，方法外无法调用
	  }
	}