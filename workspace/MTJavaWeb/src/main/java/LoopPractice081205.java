public class LoopPractice081205 {
	public static void main(String[] args) {
		String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};
		
		//ʹ����ǿeach-forѭ����������������Ԫ�ص��ַ���������ȡ�ַ�����������.length()
		int characterCount = 0;
		for(String[] wordRow: wordData){
      for(String word: wordRow){
        characterCount += word.length();
      }
    }
    System.out.println(characterCount);
    
        //ʹ��whileѭ��������������Ԫ�ز���ӡ��������λ��
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