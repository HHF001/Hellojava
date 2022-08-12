public class LoopPractice081205 {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
		
		//使用增强each-for循环计算数列中所有元素的字符总数，获取字符数量方法：.length()
		int characterCount = 0;
		for(String[] wordRow: wordData){
      for(String word: wordRow){
        characterCount += word.length();
      }
    }
    System.out.println(characterCount);
    
        //使用while循环遍历数列所有元素并打印出其序列位置
    int i = 0, j = 0;
    while(i < wordData.length){
      j = 0;
      while(j < wordData[i].length){
        System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
        j++;
      }
      i++;
    }
    
	}
	
}