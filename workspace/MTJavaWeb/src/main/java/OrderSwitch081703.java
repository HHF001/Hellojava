public class OrderSwitch081703 {
  boolean isFilled;
  double billAmount;
  String shipping;
           //判断价格是否超标
  public OrderSwitch081703(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
            //判断是否购买
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
               //判断物品的价格
  public double calculateShipping() {
    double shippingCost;
	 	// declare switch statement here
    switch(shipping){
      case "Regular":
      shippingCost = 0;
      break;
      case "Express":
      shippingCost = 1.75;
      break;
      default:
      shippingCost = 0.50;
    }
    
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // 调用构造函数创建两个对象
	OrderSwitch081703 book = new OrderSwitch081703(true, 9.99, "Express");
	OrderSwitch081703 chemistrySet = new OrderSwitch081703(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
