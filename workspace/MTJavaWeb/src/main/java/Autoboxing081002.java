public class Autoboxing081002{
 
  public static int acceptWrapperObj(Integer intVal) {               //5�Զ�װ��
    System.out.println("Value of Integer wrapper object: " + intVal.toString());
    int toReturn = intVal;                                           //�Ѷ������Ϊԭʼ��������
    return toReturn;
  }
 
  public static Double acceptPrimitiveDouble(double doubleVal) {         //testDoubleObj�Զ�����
    System.out.println("Value of primitive double: " + doubleVal);
    Double toReturn = Double.valueOf(doubleVal);
    return toReturn;
  }
 
  public static void main(String[] args) {
    int testInt = 5;
    int resultInt = acceptWrapperObj(testInt);                    // ���÷������ ԭʼֵ
 
    Double testDoubleObj = Double.valueOf(3.14);                 //3.14װ��
    Double resultDouble = acceptPrimitiveDouble(testDoubleObj);  // ���÷����򿪰�װ����
  }
}