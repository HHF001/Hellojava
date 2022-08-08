import java.util.HashMap;                                            //����HashMap��

class HashMap080502 {
  public static void main(String[] args) {

    HashMap<String,String> flowerNames = new HashMap<>();             //����һ����ΪflowerNames��HashMap����

    flowerNames.put("Lily", "Lilium");                               // HashMap�����������ֵ��
    flowerNames.put("Sunflower","Helianthus");
    flowerNames.put("Daffodil", "Narcissus");
    flowerNames.put("Orchid", "TBD");
    System.out.println(flowerNames);                                //���HashMap����{Orchid=TBD, Daffodil=Narcissus, Sunflower=Helianthus, Lily=Lilium}

    flowerNames.remove("Daffodil");                                //�Ƴ�"Daffodil"��ֵ��

    flowerNames.replace("Orchid","Orchidaceae");                   //������"Orchid"����Ӧ��ֵ�޸�Ϊ"Orchidaceae"

    for (String key: flowerNames.keySet()) {                       //����HashMap����
      System.out.println("The scientific name for " + key + " is " + flowerNames.get(key));
    }
  }
}