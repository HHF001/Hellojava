import java.util.HashMap;                                            //导入HashMap类

class HashMap080502 {
  public static void main(String[] args) {

    HashMap<String,String> flowerNames = new HashMap<>();             //创建一个名为flowerNames的HashMap数组

    flowerNames.put("Lily", "Lilium");                               // HashMap数组中输入键值对
    flowerNames.put("Sunflower","Helianthus");
    flowerNames.put("Daffodil", "Narcissus");
    flowerNames.put("Orchid", "TBD");
    System.out.println(flowerNames);                                //输出HashMap数组{Orchid=TBD, Daffodil=Narcissus, Sunflower=Helianthus, Lily=Lilium}

    flowerNames.remove("Daffodil");                                //移除"Daffodil"键值对

    flowerNames.replace("Orchid","Orchidaceae");                   //数组中"Orchid"键对应的值修改为"Orchidaceae"

    for (String key: flowerNames.keySet()) {                       //遍历HashMap数组
      System.out.println("The scientific name for " + key + " is " + flowerNames.get(key));
    }
  }
}