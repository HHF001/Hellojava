class Pho extends Noodle080405 {                      //继承父类
  public Pho() {                                      //子类构造函数
    super("flat");                                    //调用父类构造函数
  }
}

class Noodle080405 {
  boolean isCooked = false;
  String shape;
  public Noodle080405(String shape) {                  //父类构造函数
     this.shape = shape;                               //将实例变量赋值给参数值
  }
  
  public static void main(String[] args) {
     Pho lunch = new Pho();
     System.out.println(lunch.shape);
     System.out.println(lunch.isCooked);
  }
}
