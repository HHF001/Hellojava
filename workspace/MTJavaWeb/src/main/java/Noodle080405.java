class Pho extends Noodle080405 {                      //�̳и���
  public Pho() {                                      //���๹�캯��
    super("flat");                                    //���ø��๹�캯��
  }
}

class Noodle080405 {
  boolean isCooked = false;
  String shape;
  public Noodle080405(String shape) {                  //���๹�캯��
     this.shape = shape;                               //��ʵ��������ֵ������ֵ
  }
  
  public static void main(String[] args) {
     Pho lunch = new Pho();
     System.out.println(lunch.shape);
     System.out.println(lunch.isCooked);
  }
}
