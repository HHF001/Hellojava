public class Person081803{
  public int age;
  public int wisdom;
  public int fitness;
      //���캯������    ͨ������һ��ʵ���������þֲ���������
  public Person081803(int inputAge){
    this.age = inputAge;                     
    this.wisdom = inputAge * 5;
    this.fitness = 100 - inputAge;
  }
         //�������þֲ���������
  public void setAge(int newAge){
    this.age = newAge;
  }
  public void setWisdom(int newWisdom){
    this.wisdom = newWisdom;
  }
  public void setFitness(int newFitness){
    this.fitness = newFitness;
  }
         //�·���
  public void hasBirthday(){
    //Complete this method
    this.setAge(this.age + 1);                                   //�ֲ���������֮�����¸�ֵ
    this.setWisdom(this.wisdom + 5);
    this.setFitness(this.fitness - 3);

  }

  public static void main(String[] args){
    Person081803 emily = new Person081803(10);                   //�����캯����������һ��20��ʵ������������������þֲ�����
    emily.hasBirthday();                                         //�����·���
    System.out.println("New age is: " + emily.age);
    System.out.println("New wisdom is: " + emily.wisdom);
    System.out.println("New fitness is: " + emily.fitness);
  }
}