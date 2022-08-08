 class Car{
	public String color;
	private int speed;
	
	public Car(String color,int speed) {
		this.color = color;
		this.speed = speed;
		/*public void changeTires1() {
		    int numTires = 4;
		    int changedTires = 0;
		    for (int i = 0; i < numTires; i++) {
		      changedTires += 1;
		    }
		    // numTires 和changedTires 可以被访问，i不行，只在循环里使用
		  }*/
		System.out.println("color: "+ color +" speed: "+speed);
	}
	
	public void drive(boolean fourWheel) {
		boolean tires = fourWheel;                  //fourWheel和tires只有在此方法内才能使用,当drive方法完成后，fourWheel和tires会被销毁
	}
	
	public void piant(String newColor,String newColor2) {
		//newColor和newColor也是只能在该方法内使用，方法完成后会被销毁
	}
}

public class Car080402{
	public static void main(String[] args) {
		Car carObject = new Car("blue",70);        //调用的是public方法
		//String carColor = carObject.color;         
		System.out.println(carObject.color);       //color是public，可以访问
		//System.out.println(carObject.speed);    //speed是private私有访问变量，不能访问
		System.out.println(carObject);
	}
}