public class Bee080504{
	private String name;                      //定义一个私有字符型变量name
	private boolean isHome;                   //定义一个私有布尔型变量isHome
	
	public Bee080504(String name) {           //构造函数
		this.name = name;                     //把实例变量赋值给参数值
		this.isHome = true;                   //实例变量赋值给参数值
	}
	
	public String getName() {                //外部类获取私有变量name值的方法
		return this.name;
	}
	
	public void setName(String newName) {    //传入一个实例变量赋值给参数值
		this.name = newName;
	}
	
	public boolean isHome() {               //外部类获取私有变量isHome值的方法
		return this.isHome;
	}
	
	public void leaveHome() {              //把false值实例变量赋值给参数值
		this.isHome = false;
	}
	public void returnHome() {              //把true值实例变量赋值给参数值
		this.isHome = true;
	}
}