public class Dog080805 {
  String breed;                //����
  boolean hasOwner;
  int age;
  
  public Dog080805(String dogBreed, boolean dogOwned, int dogYears) {      //���캯��
    System.out.println("Constructor invoked!");
    breed = dogBreed;                                                      //�����ʵ��������ֵ������ֵ
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  public static void main(String[] args) {                                 //main����
    System.out.println("Main method started");    
    Dog080805 fido = new Dog080805("poodle", false, 4);                    //����һ������fido
    Dog080805 nunzio = new Dog080805("shiba inu", true, 12);               
    boolean isFidoOlder = fido.age > nunzio.age;                           //�ж�fido����������Ƿ����nunzio������
    int totalDogYears = nunzio.age + fido.age;                             //�������������ܹ�������
    System.out.println("Two dogs created: a " + fido.breed + " and a " + nunzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}