class Reverse081501{
	      //把字符串里所有字符倒序排列，for循环
	public static String reverseString(String text) {
		String resert = new String("");                   //新建一个空字符串
		for(int i = 0 ;i < text.length();i++) {           //遍历输入实例所有字符
			char nextCharacter = text.charAt(i);          //把遍历出来的字符赋给一个空字符
			resert = nextCharacter + resert;              //把遍历出来的字符赋加在新建的空字符串前，组成新的字符串
		}
		return resert;                                    //返回新字符串
	}
	
	       //while循环
	public static String reverseString1(String text) {
		String resert = new String("");
		int i = 0 ;
		while(i < text.length()) {
			char nextCharacter = text.charAt(i);
			resert = nextCharacter + resert;
			i++;
		}
		return resert;
	}
	public static void main(String[] args) {
		String text = new String("abcdefg,fhh,higklmn");
		System.out.println(reverseString1(text));
	}
}