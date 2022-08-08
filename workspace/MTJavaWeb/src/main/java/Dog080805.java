public class Dog080805 {
  String breed;                //定义
  boolean hasOwner;
  int age;
  
  public Dog080805(String dogBreed, boolean dogOwned, int dogYears) {      //构造函数
    System.out.println("Constructor invoked!");
    breed = dogBreed;                                                      //输入的实例变量赋值给参数值
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {                                 //main函数
    System.out.println("Main method started");    
    Dog080805 fido = new Dog080805("poodle", false, 4);                    //创建一个对象fido
    Dog080805 nunzio = new Dog080805("shiba inu", true, 12);               
    boolean isFidoOlder = fido.age > nunzio.age;                           //判断fido对象的年龄是否大于nunzio的年龄
    int totalDogYears = nunzio.age + fido.age;                             //定义两个变量总共的年龄
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}