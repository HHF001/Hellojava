public class Test002 {
    public static void main(String []args){
        // 方法一
        int sum1=1;
        for(int i=9;i>=1;i--){
            sum1=(sum1+1)*2;
        }        
        System.out.println("sum1="+sum1);
     // 方法二
        int sum2=1;
        for (int i=1;i<=9;i++){
            sum2=(sum2+1)*2;            
        }
        System.out.println("sum2="+sum2);        
    }
}