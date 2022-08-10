public class Autoboxing081002{
 
  public static int acceptWrapperObj(Integer intVal) {               //5自动装箱
    System.out.println("Value of Integer wrapper object: " + intVal.toString());
    int toReturn = intVal;                                           //把对象拆箱为原始数据类型
    return toReturn;
  }
 
  public static Double acceptPrimitiveDouble(double doubleVal) {         //testDoubleObj自动拆箱
    System.out.println("Value of primitive double: " + doubleVal);
    Double toReturn = Double.valueOf(doubleVal);
    return toReturn;
  }
 
  public static void main(String[] args) {
    int testInt = 5;
    int resultInt = acceptWrapperObj(testInt);                    // 调用方法输出 原始值
 
    Double testDoubleObj = Double.valueOf(3.14);                 //3.14装箱
    Double resultDouble = acceptPrimitiveDouble(testDoubleObj);  // 调用方法打开包装对象
  }
}