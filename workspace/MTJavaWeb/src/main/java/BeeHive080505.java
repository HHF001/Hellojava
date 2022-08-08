import java.util.ArrayList;

public class BeeHive080505{
	private ArrayList<Bee080504> beeList;                        //创建一个Bee080504类型的数组名为beeList
	
	public BeeHive080505(int numBees) {                         //带一个整数型参数的构造函数
		this.beeList = new ArrayList<Bee080504>();              //创建一个Bee类型的数组赋值给参数数组
		for(int i = 0; i < numBees;i++) {                       //迭代小于numBees参数时候，运行以下程序
			this.beeList.add(new Bee080504("bee" + i));         //在beeList数组里添加一个元素并叫做“beei”
		}
	}
	
	public void printBees() {                                  //输出每只蜜蜂名字的方法
		for(Bee080504 b: this.beeList) {                       //for-each循环输出beeList数组里每个元素
			System.out.println(b.getName());                   //每次进入循环就调用getName()方法获取name并输出
		}
	}
	
	public ArrayList<Bee080504> getBeeList(){
		return this.beeList;
	}
	
	public void addBees(ArrayList<String> beeNames) {            //添加数组方法
		for(String name: beeNames) {                             //遍历实例数组的每一个元素
			this.beeList.add(new Bee080504(name));               //把遍历出来的每一个实例数组元素添加到参数数组里面
		}
	}
	
	public void moveOutBees() {                                //移除方法
		for(int i = 0; i < this.beeList.size();i++) {          /*没懂为什么会相隔一个移除*/
			this.beeList.remove(i);
		}
	}
	
	public void leaveHome(String beeName) {                    //接收离家蜜蜂的名字
		for(Bee080504 b: this.beeList) {                       //蜜蜂数组遍历
			if(b.getName().equals(beeName)) {                  //判断数组里面每个元素名字是否与接收到的名字相同，若相同，执行下语句
				b.leaveHome();                                 //把相同名字的蜜蜂输入到leaveHome方法中并调用该方法
			}
		}
	}
	
	public void renameBees(ArrayList<String> newNames) {       //更改名字方法
		int numNamesToAssign = this.beeList.size();            //定义一个整数型为参数数组的元素数量
		if(newNames.size() < this.beeList.size() ) {           //如果输入的名字小于参数数组的数量，执行下面语句
			numNamesToAssign =newNames.size();                 //输入名字的数量赋予新定义的整数型
		}
		for(int i = 0 ; i < numNamesToAssign;i++) {            //从零开始到最小数量的数组数量循环
			this.beeList.get(i).setName(newNames.get(i));      //把从参数数组获取到的名字更换为新输入的名字
		}
	}
	public static void main(String[] args) {                    //main主函数，程序从这里开始运行
		BeeHive080505 myHive = new BeeHive080505(10);           //创建一个名为myHive的对象
		//myHive.printBees();
		myHive.leaveHome("bee43");                              //输入一个离开家的蜜蜂的代码
		System.out.println(myHive.beeList.get(7).isHome());    //印刷蜂的地位，以确保它不再是在家
		System.out.println("-------------------------");
		//BeeHive080505 newHive = new BeeHive080505(3);
		ArrayList<String> newBees = new ArrayList<>();          //新创建一个String数组newBees
		newBees.add("bob");                                     //新建数组中添加元素
		newBees.add("macy");
		newBees.add("anna");
		myHive.addBees(newBees);                                //把新添加的数组添加到myHive对象中
		for(Bee080504 b: myHive.beeList) {                      //遍历输出myHive对象中数组内地每一个元素
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");
		/*myHive.moveOutBees();                                   //调用移除方法
		for(Bee080504 b: myHive.beeList) {                      
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");*/
		ArrayList<String> newNames = new ArrayList<>();         //创建一个newName的数组
		newNames.add("one");                                    //新数组中添加元素
		newNames.add("two"); 
		newNames.add("three");
		newNames.add("four");
		myHive.renameBees(newNames);                            //调用更改名字方法
		for(Bee080504 b: myHive.beeList) {                      //遍历输出myHive对象中数组内地每一个元素
			System.out.println(b.getName()); 
		}
		System.out.println("-------------------------");
		
	}
}
