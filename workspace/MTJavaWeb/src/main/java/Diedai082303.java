class Diedai082303{
	           //使用循环遍历输出各个字母倒序组合
	public static String reverseString(String text) {
		  String reversed = new String("");
		  for (int i=0; i < text.length(); i++){
		    reversed = text.charAt(i) + reversed;
		  }
		  return reversed;
		}
	         //使用递归方法遍历各个字母倒序组合
	public static String reverseString1(String text){
		  // 基本情况
		  if (text.length() == 0) {
		    return text;
		  } else {
		    // 递归调用
		    return reverseString(text.substring(1)) + text.charAt(0);    //实例数组后一个字母+前一个字母的排列组合
		  }
		}
		public static void main(String[] args) {
		  String str = new String("howdy");
		  String reverse = reverseString(str);
		  System.out.println(reverse); // Prints: ydwoh
		  String reverse1 = reverseString1(str);
		  System.out.println(reverse1); // Prints: ydwoh
		}
}