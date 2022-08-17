public class Order081701 {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
                  //判断数额是否超标
  public Order081701(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {                               //只要调用构造函数，必执行该判断语句
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }         
               //判断是否购买
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());          //调用价格方法获得价格
    } else {
      System.out.println("Order not ready");
    }
  }
           //判断物品的价格
  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
       if(couponCode.equals("ship50")){            //嵌套if语句
         return .85;
       }else{
         return 1.75;
       }
      
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // 调用构造函数创建两个对象
    Order081701 book = new Order081701(true, 9.99, "Express", "ship50");
    Order081701 chemistrySet = new Order081701(false, 72.50, "Regular", "freeShipping");        //只要调用了构造函数，比执行if语句
    
    book.ship();
    chemistrySet.ship();
  }
}
