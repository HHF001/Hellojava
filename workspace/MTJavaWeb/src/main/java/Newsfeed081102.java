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
    System.out.println(topics);                           //�����ַ[Ljava.lang.String;@515f550a
    String topicsl = Arrays.toString(topics);             //����Arrays���tostring��������ʹ��ӡ��������
    System.out.println(topicsl);                          //�����������[Opinion, Tech, Science, Health]

  }
}