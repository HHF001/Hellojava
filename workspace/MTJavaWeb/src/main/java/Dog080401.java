public class Dog080401{
	private String name;
	
	public Dog080401(String name) {
		this.name = name;                          //将实例变量赋值给参数值
	}
	
	public String getName() {                     //访问器方法，访问本类中的私有实例变量
		return name;
	}
	
	public void setName(String newName) {         //通常是void返回方法，不返回任何东西，只是重置现有变量的值
		name =newName;                            //将实例变量赋值给参数值
	}
	
	public static void main(String[] args) {
		Dog080401 myDog = new Dog080401("Cujo");
		System.out.println(myDog.getName());    //输出coji
		System.out.println(myDog);
		myDog.setName("Lassie");                //调用set方法另赋值
		System.out.println(myDog.getName());    //输出Lassie
		System.out.println(myDog);              //输出内存地址
	}
}