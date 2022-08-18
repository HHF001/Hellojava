public class Person081803{
  public int age;
  public int wisdom;
  public int fitness;
      //构造函数方法    通过接收一个实例变量设置局部变量参数
  public Person081803(int inputAge){
    this.age = inputAge;                     
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }
         //重新设置局部变量方法
  public void setAge(int newAge){
    this.age = newAge;
  }
  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }
  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }
         //新方法
  public void hasBirthday(){
    //Complete this method
    this.setAge(this.age + 1);                                   //局部变量运算之后重新赋值
    this.setWisdom(this.wisdom + 5);
    this.setFitness(this.fitness - 3);

  }

  public static void main(String[] args){
    Person081803 emily = new Person081803(10);                   //给构造函数方法输入一个20的实例参数变量，运算后获得局部变量
    emily.hasBirthday();                                         //调用新方法
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}