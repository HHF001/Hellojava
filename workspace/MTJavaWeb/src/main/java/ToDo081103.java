import java.util.ArrayList;

public class ToDo081103 {
    
  public static void main(String[] args) {
    
    // Sherlock
    ArrayList<String> sherlocksToDos = new ArrayList<String>();
    
    sherlocksToDos.add("visit the crime scene");
    sherlocksToDos.add("play violin");
    sherlocksToDos.add("interview suspects");
    sherlocksToDos.add("solve the case");
    sherlocksToDos.add("apprehend the criminal");
    
    // Poirot
    ArrayList<String> poirotsToDos = new ArrayList<String>();
    
    poirotsToDos.add("visit the crime scene");
    poirotsToDos.add("interview suspects");
    poirotsToDos.add("let the little grey cells do their work");
    poirotsToDos.add("trim mustache");
    poirotsToDos.add("call all suspects together");
    poirotsToDos.add("reveal the truth of the crime");
    
           // 更改任务内容
    sherlocksToDos.set(1,"listen to Dr. Watson for amusement");
    poirotsToDos.set(3,"listen to Captain Hastings for amusement");
    
           //删除任务内容
    sherlocksToDos.remove("visit the crime scene");
    sherlocksToDos.remove("play violin");
    poirotsToDos.remove("visit the crime scene");

    System.out.println("Sherlock's to-do list:");
    System.out.println(sherlocksToDos.toString() + "\n");
    System.out.println("Poirot's to-do list:");
    System.out.println(poirotsToDos.toString());
           //查找夏洛克什么第几个任务去破案
    int one = sherlocksToDos.indexOf("solve the case");
    System.out.println(one);
  }
  
}