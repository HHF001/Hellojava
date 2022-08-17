public class Order081701 {
  boolean isFilled;
  double billAmount;
  String shipping;
  String couponCode;
                  //�ж������Ƿ񳬱�
  public Order081701(boolean filled, double cost, String shippingMethod, String coupon) {
		if (cost > 24.00) {                               //ֻҪ���ù��캯������ִ�и��ж����
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    couponCode = coupon;
  }         
               //�ж��Ƿ���
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());          //���ü۸񷽷���ü۸�
    } else {
      System.out.println("Order not ready");
    }
  }
           //�ж���Ʒ�ļ۸�
  public double calculateShipping() {
    if (shipping.equals("Regular")) {
      return 0;
    } else if (shipping.equals("Express")) {
      // Add your code here
       if(couponCode.equals("ship50")){            //Ƕ��if���
         return .85;
       }else{
         return 1.75;
       }
      
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // ���ù��캯��������������
    Order081701 book = new Order081701(true, 9.99, "Express", "ship50");
    Order081701 chemistrySet = new Order081701(false, 72.50, "Regular", "freeShipping");        //ֻҪ�����˹��캯������ִ��if���
    
    book.ship();
    chemistrySet.ship();
  }
}
