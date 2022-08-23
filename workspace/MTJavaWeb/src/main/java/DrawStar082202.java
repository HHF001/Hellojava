public class DrawStar082202{
	      //输出1.2.3.4个星星
	public static void main(String[] args) {
		for(int i = 1;i <= 4;i++) {      //控制4行
			//画星星
			for(int j = 1;j <= i;j++) {
				System.out.print("*");
			}
			System.out.println();        //换行
		}
	}
}