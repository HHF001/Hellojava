class Diedai082303{
	           //ʹ��ѭ���������������ĸ�������
	public static String reverseString(String text) {
		  String reversed = new String("");
		  for (int i=0; i < text.length(); i++){
		    reversed = text.charAt(i) + reversed;
		  }
		  return reversed;
		}
	         //ʹ�õݹ鷽������������ĸ�������
	public static String reverseString1(String text){
		  // �������
		  if (text.length() == 0) {
		    return text;
		  } else {
		    // �ݹ����
		    return reverseString(text.substring(1)) + text.charAt(0);    //ʵ�������һ����ĸ+ǰһ����ĸ���������
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