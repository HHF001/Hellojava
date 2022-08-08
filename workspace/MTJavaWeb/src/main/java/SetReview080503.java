import java.util.*;                                    //引入所有java类       

class SetReview080503 {
  public static void main(String[] args) {              

    Set<String> colors = new HashSet<String>();        //创建一个名为colors的HashSet集合
    colors.add("red");                                 //集合中添加项目
    colors.add("orange");
    System.out.println(colors);                        //输出集合[red, orange]
    if (colors.contains("red")){                       //判断集合中是否含有“red”项目，有则运行下面输出语句
      System.out.println("Set contains red");
    }

    Set<String> primary = new HashSet<String>();       //另创建一个名为primary的HashSet集合
    primary.add("red");                                //添加项目
    primary.add("yellow");
    primary.add("green");
    primary.remove("green");                           //移除集合中的“green”项目
    for (String value: primary) {                      //遍历输出primary集合中的所有项目
      System.out.println(value);
    }

    //colors.addAll(primary);                          //两个集合的并集：[red, orange, yellow]
    //colors.retainAll(primary);                         //两个集合的交集：[red]
    colors.removeAll(primary);                         //集合的补集：[orange]
    System.out.println(colors); 

    System.out.println(colors.size());                //新color集合包含的项目数量
  }
}