import java.util.Arrays;

public class Newsfeed081102 {
  
  
  public Newsfeed081102(){
    
  }
    
  public String[] getTopics(){
    String[] topics = {"Opinion", "Tech", "Science", "Health"};
    return topics;
  }
  

  public static void main(String[] args){
    Newsfeed081102 sampleFeed = new Newsfeed081102();
    String[] topics = sampleFeed.getTopics();
    System.out.println(topics);                           //输出地址[Ljava.lang.String;@515f550a
    String topicsl = Arrays.toString(topics);             //调用Arrays类的tostring（）方法使打印数组内容
    System.out.println(topicsl);                          //输出数组内容[Opinion, Tech, Science, Health]

  }
}