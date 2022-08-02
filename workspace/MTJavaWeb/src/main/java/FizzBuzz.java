class FizzBuzz{
  public static void main(String[] args){
    String a = "FizzBuzz";
    String b = "Fizz";
    String c = "Buzz";
   for(int i = 1;i <= 100;i++){
     if(i % 3 == 0 && i % 5 == 0 ){
       System.out.println(a);
     }else if(i % 3 == 0&&i % 5 != 0){
       System.out.println(b);
     }else if(i % 3 != 0&&i % 5 == 0){
       System.out.println(c);
     }else{
     System.out.println(i);
     }
   }
  }
}