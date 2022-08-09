public class Droid080903{
	int batteryLevel;
	String name;
	
	public Droid080903(String newName) {
		name = newName;
		batteryLevel = 100;
	}
	
	public String toString() {
	    return "Hey there, I am a Droid: " + name ;
	  }
	public void performTask(String tesk) {
		System.out.println(name+" is performing task: "+tesk);
		batteryLevel -= 10;
		System.out.println("batteryLevel:"+batteryLevel);
	}
	public static void main(String[] args) {
		Droid080903 Droid = new Droid080903("Codey");
		System.out.println(Droid);
		Droid.performTask("dance");
	}
}