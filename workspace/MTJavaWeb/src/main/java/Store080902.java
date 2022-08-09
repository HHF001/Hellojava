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
  
  public double getPriceWithTax(){                             //��˰֮��ļ۸�
     double tax = 0.08;
     double totalPrice = price + price*tax;
     return totalPrice;                                        //�����ڶ���ı���ͨ��return������ֵ
  }
  public String toString(){                                   //ת����������޴˷���������ӡ�����ڴ��ַ
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
    System.out.println(lemona);                             //toString����ת����������޴˷���������ӡ�����ڴ��ַ
    System.out.println(cookieShop);
  }
}