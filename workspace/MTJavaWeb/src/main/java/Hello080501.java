import java.util.ArrayList;                                           //����ArrayList��
import java.util.LinkedList;                                          //����LinkedList��
import java.util.HashMap;                                             //����HashMap��
import java.util.Set;                                                 //����Set��
import java.util.HashSet;                                             //����HashSet��
import java.util.TreeSet;                                             //����TreeSet��
import java.util.LinkedHashSet;                                       //����LinkedHashSet��
import java.util.*;                                                   //����java������


public class Hello080501{
	public static void main(String[] args) {
		            
		              //ArrayList���Ӧ��
		ArrayList<String> months = new ArrayList<String>(12);          //����һ������Ϊ12�������б�
		months.add("January");                                         //add�����������Ԫ�ء�January��
		months.add("February");
		months.add("March");
		months.remove("February");                                     //�Ƴ�������Ԫ�ء�February��
	    System.out.println(months);                                    //�������Ԫ��[January, March]
                  
	                  //LinkedList���Ӧ��
		LinkedList<String> days = new LinkedList<String>();            //����һ��û�д�С���Ƶ�����
		days.add("Monday");                                            //add�����������Ԫ�ء�Monday��
		days.add("Tuesday");
		days.add(0, "Sunday");                                         //�ڵ�һ��Ԫ��λ�����һ����Sunday��Ԫ�أ�����Ԫ�ؾ�����һλ
		days.remove(2);                                                //�Ƴ������е�3��Ԫ�ء�Tuesday��
		System.out.println(days);                                      //�������Ԫ��[Sunday, Monday]
                
		              //HashMap���Ӧ��
		HashMap<String,Integer> teaTemp = new HashMap<>();             //����һ������String����Integerֵ��HashMap
		teaTemp.put("Oolong", 185);                                    //��HashMap��Ӽ�-ֵ��
		teaTemp.put("Rooibos",212);
		System.out.println(teaTemp);                                   //���HashMap�еļ�-ֵ��{Oolong=185, Rooibos=212}
		int oolongTemp = teaTemp.get("Oolong");                        //����һ��������oolongTemp����teaTemp��Oolong����Ӧ��ֵ����teaTemp��Oolong
		System.out.println(oolongTemp);                                //��� 185
		teaTemp.remove("Oolong");                                      //ɾ��teaTemp��Oolong��ֵ��
		System.out.println(teaTemp);                                   //���{Rooibos=212}
		teaTemp.put("Oolong", 185); 
		System.out.println(teaTemp.size());                             //size()�������Ҵ��ڵļ�ֵ������
		//teaTemp.clear();                                              //ɾ�����еļ�ֵ��
		//System.out.println(teaTemp);                                  //���{ }
		for(String key : teaTemp.keySet()) {                                        //ʹ��for-eachѭ�������б��е�ÿ��Ԫ��
			System.out.println("Brew " + key +"tea at "+teaTemp.get(key)+"��F");
		}
		System.out.println(teaTemp.containsKey("Oolong"));             //�ж��������Ƿ���"Oolong"�����������ture�������false,�˴����ture
		System.out.println(teaTemp.containsKey("Green"));              //���false
		teaTemp.replace("Rooibos",245);                                //.replace()�����޸����������ֵ��������ֵ��
		System.out.println(teaTemp.get("Rooibos"));                    //��get()������ȡ"Rooibos"�µõ���ֵ
		System.out.println(teaTemp.keySet());                          //.keySet()������������а��������м�ֵ��[Oolong, Rooibos]
		System.out.println(teaTemp.values());                          //.values()������������а���������ֵ��[185, 245]
		
		                    //set���� 
		Set<String> colors = new HashSet<String>();                    //����set����Ҫ˵���������ͣ��������ͣ��ͽ�ʹ�õļ�������
		TreeSet<Integer> myNumbers = new TreeSet<Integer>();           //����һ������Integerֵ��TreeSet:
		colors.add("red");                                             //color���������Ԫ�ء�red��
		colors.add("blue");
		colors.add("blue");                                            //����ظ�Ԫ�ػᱻ����
		colors.add("green");
		System.out.println(colors);                                    //���������Ԫ��[red, green, blue]����ϣ������������˳��
		colors.remove("green");                                        //�Ƴ�Ԫ�ء�green��
		System.out.println(colors);                                    //�������ʣ��Ԫ��[red, blue]
		System.out.println(colors.contains("red"));                    //.contains()��鼯�����Ƿ���Ԫ�ء�red���������true�������false���˴����true
		System.out.println(colors.contains("green"));                  //���false
		System.out.println(colors.size());                             //.size()�������ؼ����а�������Ŀ����2
		for(String item: colors) {                                     //for-eachѭ���������������ÿ����Ŀ
			System.out.println(item);
		}
		Set<String> primary = new HashSet<>();                        //����һ��HashSet����
		primary.add("red");                                           //�¼����������Ŀ
		primary.add("yellow");
		colors.addAll(primary);                                       //.addAll()�������¼��ϲ���color�����У���ͬ����Ŀ���ԣ���ͬ��Ŀ���
		System.out.println(colors);                                   //����µ�color������Ŀ��[red, blue, yellow]
		colors.remove("yellow");
		colors.retainAll(primary);                                    //.retainAll()����������������ͬ�Ĳ��֣��ཻ�����Ƴ������һ���¼���
		System.out.println(colors);                                   //����µ�color����[red]
        colors.add("blue");
        colors.removeAll(primary);                                   //.removeAll()����ǰ��һ�����ϵ�Ԫ�ؼ�ȥ��һ�������к��е���ͬ��Ԫ�أ�ʣ�µ�Ԫ������µļ���
        System.out.println(colors);                                  //����µ�color����[blue]
		
	}
}