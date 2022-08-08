class Cupcake {                  //创建一个类Capcake                     
  String flavor;
  boolean sprinkles;
 
  public Cupcake(String type, boolean hasSprinkles) {        //Capcake类的构造函数 
    flavor = type;
    sprinkles = hasSprinkles;
  }
  
  public Cupcake(Cupcake copy) {                             //创建一个复制构造函数
	  flavor = copy.flavor;
	  sprinkles = copy.sprinkles;
  }
}

public class Bakery080804 {                 //创建一个Bakery类
	  Cupcake bakeryCupcake;               //定义一个Cupcake类对象
	  double price;
	  String giveTotal;
	 
	 public Bakery080804(Cupcake cupcakeType, double priceOf) {      //Bakery类构造函数     
	    Cupcake copy = new Cupcake(cupcakeType);                     //创建一个Cupcake复制类对象
	    bakeryCupcake = copy;                                        //设置bakeryCupcake保存对象副本的值
	    price = priceOf;
	    bakeryCupcake.flavor = "125";
	    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;
		/*bakeryCupcake = cupcakeType;
	    price = priceOf;
	    
	    bakeryCupcake.flavor = "125";                                 //bakeryCupcake另赋值
	    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is €" + price;*/
	  }

	  public static void main(String[] args) {                          //main主函数
		  Cupcake chocolateSprinkle = new Cupcake("chocolate", true);

		    // 创建一个接受对象作为参数的对象
		    Bakery080804 myBakery = new Bakery080804(chocolateSprinkle, 3.25);
		    
		    // 输出参数object的值
		    System.out.println("Our object sent as a parameter has a flavor value of "  + myBakery.bakeryCupcake.flavor);

		    // 输出原始对象的值
		    System.out.println("Our original object has a flavor value of " + chocolateSprinkle.flavor);
		  }
	}