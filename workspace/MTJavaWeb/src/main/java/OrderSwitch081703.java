public class OrderSwitch081703 {
  boolean isFilled;
  double billAmount;
  String shipping;
           //�жϼ۸��Ƿ񳬱�
  public OrderSwitch081703(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
            //�ж��Ƿ���
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
               //�ж���Ʒ�ļ۸�
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
    // ���ù��캯��������������
	OrderSwitch081703 book = new OrderSwitch081703(true, 9.99, "Express");
	OrderSwitch081703 chemistrySet = new OrderSwitch081703(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}
