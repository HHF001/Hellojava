import java.util.ArrayList;                                           //导入ArrayList类
import java.util.LinkedList;                                          //导入LinkedList类
import java.util.HashMap;                                             //导入HashMap类
import java.util.Set;                                                 //导入Set类
import java.util.HashSet;                                             //导入HashSet类
import java.util.TreeSet;                                             //导入TreeSet类
import java.util.LinkedHashSet;                                       //导入LinkedHashSet类
import java.util.*;                                                   //导入java所有类


public class Hello080501{
	public static void main(String[] args) {
		            
		              //ArrayList相关应用
		ArrayList<String> months = new ArrayList<String>(12);          //创建一个容量为12的数组列表
		months.add("January");                                         //add（）方法添加元素“January”
		months.add("February");
		months.add("March");
		months.remove("February");                                     //移除数组中元素“February”
	    System.out.println(months);                                    //输出数组元素[January, March]
                  
	                  //LinkedList相关应用
		LinkedList<String> days = new LinkedList<String>();            //创建一个没有大小限制的链表
		days.add("Monday");                                            //add（）方法添加元素“Monday”
		days.add("Tuesday");
		days.add(0, "Sunday");                                         //在第一个元素位置添加一个“Sunday”元素，其他元素均后移一位
		days.remove(2);                                                //移除链表中第3个元素“Tuesday”
		System.out.println(days);                                      //输出链表元素[Sunday, Monday]
                
		              //HashMap相关应用
		HashMap<String,Integer> teaTemp = new HashMap<>();             //声明一个带有String键和Integer值的HashMap
		teaTemp.put("Oolong", 185);                                    //向HashMap添加键-值对
		teaTemp.put("Rooibos",212);
		System.out.println(teaTemp);                                   //输出HashMap中的键-值对{Oolong=185, Rooibos=212}
		int oolongTemp = teaTemp.get("Oolong");                        //声明一个整数型oolongTemp并把teaTemp中Oolong键对应的值赋给teaTemp中Oolong
		System.out.println(oolongTemp);                                //输出 185
		teaTemp.remove("Oolong");                                      //删除teaTemp中Oolong键值对
		System.out.println(teaTemp);                                   //输出{Rooibos=212}
		teaTemp.put("Oolong", 185); 
		System.out.println(teaTemp.size());                             //size()方法查找存在的键值对数量
		//teaTemp.clear();                                              //删除所有的键值对
		//System.out.println(teaTemp);                                  //输出{ }
		for(String key : teaTemp.keySet()) {                                        //使用for-each循环遍历列表中的每个元素
			System.out.println("Brew " + key +"tea at "+teaTemp.get(key)+"°F");
		}
		System.out.println(teaTemp.containsKey("Oolong"));             //判断数组中是否含有"Oolong"键，是责输出ture，否输出false,此处输出ture
		System.out.println(teaTemp.containsKey("Green"));              //输出false
		teaTemp.replace("Rooibos",245);                                //.replace()方法修改与键关联的值：键，新值。
		System.out.println(teaTemp.get("Rooibos"));                    //。get()方法获取"Rooibos"新得到的值
		System.out.println(teaTemp.keySet());                          //.keySet()方法获得数组中包含的所有键值：[Oolong, Rooibos]
		System.out.println(teaTemp.values());                          //.values()方法获得数组中包含的所有值：[185, 245]
		
		                    //set集合 
		Set<String> colors = new HashSet<String>();                    //创建set集合要说明数据类型（引用类型）和将使用的集合类型
		TreeSet<Integer> myNumbers = new TreeSet<Integer>();           //创建一个包含Integer值的TreeSet:
		colors.add("red");                                             //color集合里添加元素“red”
		colors.add("blue");
		colors.add("blue");                                            //添加重复元素会被忽略
		colors.add("green");
		System.out.println(colors);                                    //输出集合里元素[red, green, blue]（哈希表排序不是输入顺序）
		colors.remove("green");                                        //移除元素“green”
		System.out.println(colors);                                    //输出集合剩余元素[red, blue]
		System.out.println(colors.contains("red"));                    //.contains()检查集合中是否含有元素“red”，是输出true。否输出false，此处输出true
		System.out.println(colors.contains("green"));                  //输出false
		System.out.println(colors.size());                             //.size()方法返回集合中包含的项目数：2
		for(String item: colors) {                                     //for-each循环遍历输出集合中每个项目
			System.out.println(item);
		}
		Set<String> primary = new HashSet<>();                        //另创建一个HashSet集合
		primary.add("red");                                           //新集合中添加项目
		primary.add("yellow");
		colors.addAll(primary);                                       //.addAll()方法把新集合并到color集合中，相同的项目忽略，不同项目添加
		System.out.println(colors);                                   //输出新的color集合项目：[red, blue, yellow]
		colors.remove("yellow");
		colors.retainAll(primary);                                    //.retainAll()方法把两个集合相同的部分（相交）复制出来组成一个新集合
		System.out.println(colors);                                   //输出新的color集合[red]
        colors.add("blue");
        colors.removeAll(primary);                                   //.removeAll()方法前面一个集合的元素减去后一个集合中含有的相同的元素，剩下的元素组成新的集合
        System.out.println(colors);                                  //输出新的color集合[blue]
		
	}
}