class Cupcake {                  //����һ����Capcake                     
  String flavor;
  boolean sprinkles;
 
  public Cupcake(String type, boolean hasSprinkles) {        //Capcake��Ĺ��캯�� 
    flavor = type;
    sprinkles = hasSprinkles;
  }
  
  public Cupcake(Cupcake copy) {                             //����һ�����ƹ��캯��
	  flavor = copy.flavor;
	  sprinkles = copy.sprinkles;
  }
}

public class Bakery080804 {                 //����һ��Bakery��
	  Cupcake bakeryCupcake;               //����һ��Cupcake�����
	  double price;
	  String giveTotal;
	 
	 public Bakery080804(Cupcake cupcakeType, double priceOf) {      //Bakery�๹�캯��     
	    Cupcake copy = new Cupcake(cupcakeType);                     //����һ��Cupcake���������
	    bakeryCupcake = copy;                                        //����bakeryCupcake������󸱱���ֵ
	    price = priceOf;
	    bakeryCupcake.flavor = "125";
	    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is ��" + price;
		/*bakeryCupcake = cupcakeType;
	    price = priceOf;
	    
	    bakeryCupcake.flavor = "125";                                 //bakeryCupcake��ֵ
	    giveTotal = "The " + bakeryCupcake.flavor + " cupcake is ��" + price;*/
	  }

	  public static void main(String[] args) {                          //main������
		  Cupcake chocolateSprinkle = new Cupcake("chocolate", true);

		    // ����һ�����ܶ�����Ϊ�����Ķ���
		    Bakery080804 myBakery = new Bakery080804(chocolateSprinkle, 3.25);
		    
		    // �������object��ֵ
		    System.out.println("Our object sent as a parameter has a flavor value of "  + myBakery.bakeryCupcake.flavor);

		    // ���ԭʼ�����ֵ
		    System.out.println("Our original object has a flavor value of " + chocolateSprinkle.flavor);
		  }
	}