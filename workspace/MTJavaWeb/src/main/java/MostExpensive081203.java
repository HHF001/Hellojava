import java.util.ArrayList;

class MostExpensive081203 {
  
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();
    expenses.add(74.46);
    expenses.add(93.99);
    expenses.add(10.57);
    expenses.add(81.37);
    
    double mostExpensive = 0;
    
    // 遍历数组找出最大值
    for(double expense:expenses){
      if(expense>mostExpensive){
        mostExpensive = expense;
      }
    }
    
    System.out.println(mostExpensive);
    
  }
  
}