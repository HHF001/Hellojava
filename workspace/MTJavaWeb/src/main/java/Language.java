import java.util.ArrayList;
import java.util.LinkedList;

class Language{
	protected String name;                   
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;
	
	Language(String langName, int speakers, String regions, String wdOrder){                 //构造函数
		this.name = langName;                                       //实例变量赋值给参数值
		this.numSpeakers = speakers;                                //实例变量赋值给参数值
		this.regionsSpoken = regions;                               //实例变量赋值给参数值
		this.wordOrder = wdOrder;                                   //实例变量赋值给参数值
	}
	public void getInfo() {                                          //输出方法
		 System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
		 System.out.println("The language follows the word order: " + this.wordOrder);
	}
	public static void main(String[] args) {                        //main函数，程序从这里开始运行
		Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
		spanish.getInfo();                                          //调用输出方法gerInfo()
		Mayan kiche = new Mayan("Ki'che'", 2330000);
		kiche.getInfo();                                            //调用玛雅类重写后的gerInfo()方法
		Hanyu mandarin = new Hanyu("Mandarin Chinese",14000000);
		mandarin.getInfo();                                         //子类构造函数调用语言类的输出方法，但子类有if语句也要运行
		Hanyu burmese = new Hanyu("Burmese",430000);
		burmese.getInfo();                                          //子类构造函数调用语言类的输出方法
		
		            //ArrayList相关方法及应用
		ArrayList<String> months = new ArrayList<String>(12);      //创建一个容量为12的数组列表
		months.add("一月");                                         //add（）方法添加元素“一月”
		months.add("二月");
		months.add("三月");
		System.out.println(months);                                //输出【一月 二月 三月】
		months.add(2,"March");                                     //在第三个元素位置添加一个“March”元素，其他元素均后移一位
		System.out.println(months);                                //输出【一月 二月 March 三月】
		System.out.println(months.get(1));                         //输出数组中的第二个元素“二月”
		months.remove(3);                                         //移除数组中的第四个元素“三月”
		System.out.println(months);                                //输出【一月 二月 March】
		              
		            //LinkedList相关方法及应用
		LinkedList<String> days = new LinkedList<String>();        //创建一个没有大小限制的链表
		days.add("Monday");                                        //链表中添加一个元素
		days.add("Tuesday");
		System.out.println(days);                                  //输出链表元素[Monday Tuesday]
		days.add(0,"Sunday");                                      //在链表第一个位置添加元素，其他所有元素后移一位
		System.out.println(days);                                  //输出链表元素[Sunday Monday Tuesday]
		System.out.println(days.get(1));                           //获取输出链表第二个元素 Monday
		days.remove(1);                                            //移除链表第二个元素
		System.out.println(days);                                  //输出链表元素[Sunday Tuesday]
		days.remove();                                             //移除链表头部（第一个）元素 sunday
		System.out.println(days);                                  //输出链表元素[Tuesday]
	}
}