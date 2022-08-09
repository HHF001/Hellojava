public class Store080902 {
  String productType;
  double price;
  
  public Store080902(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  public double getPriceWithTax(){                             //加税之后的价格
     double tax = 0.08;
     double totalPrice = price + price*tax;
     return totalPrice;                                        //方法内定义的变量通过return返回其值
  }
  public String toString(){                                   //转化输出，若无此方法，将打印两个内存地址
	    return "This store sells "+productType +" at a price of "+price+"." ;
	  }
  public static void main(String[] args) {
    Store080902 lemonadeStand = new Store080902("Lemonade", 3.75);
   //lemonadeStand.getPriceWithTax();
    lemonadeStand.increasePrice(1);
    System.out.println(lemonadeStand.price);
    System.out.println(lemonadeStand.getPriceWithTax());
    Store080902 lemona = new Store080902("Lemonade", 3.75);
    Store080902 cookieShop = new Store080902("Cookies", 5);
    System.out.println(lemona);                             //toString方法转化输出，若无此方法，将打印两个内存地址
    System.out.println(cookieShop);
  }
}