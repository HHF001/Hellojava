import java.util.*;                                    //��������java��       

class SetReview080503 {
  public static void main(String[] args) {              

    Set<String> colors = new HashSet<String>();        //����һ����Ϊcolors��HashSet����
    colors.add("red");                                 //�����������Ŀ
    colors.add("orange");
    System.out.println(colors);                        //�������[red, orange]
    if (colors.contains("red")){                       //�жϼ������Ƿ��С�red����Ŀ��������������������
      System.out.println("Set contains red");
    }

    Set<String> primary = new HashSet<String>();       //����һ����Ϊprimary��HashSet����
    primary.add("red");                                //�����Ŀ
    primary.add("yellow");
    primary.add("green");
    primary.remove("green");                           //�Ƴ������еġ�green����Ŀ
    for (String value: primary) {                      //�������primary�����е�������Ŀ
      System.out.println(value);
    }

    //colors.addAll(primary);                          //�������ϵĲ�����[red, orange, yellow]
    //colors.retainAll(primary);                         //�������ϵĽ�����[red]
    colors.removeAll(primary);                         //���ϵĲ�����[orange]
    System.out.println(colors); 

    System.out.println(colors.size());                //��color���ϰ�������Ŀ����
  }
}