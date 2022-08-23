public class Star082203{
	public static void main(String[] args) {
		int line = 4;
		for(int i = 1;i <= line;i++) {
			if(i == 1) {        //第一行规则
				for(int j =1;j<=2*line-1;j++) {
					System.out.print("*");
				}
			}else {           //后三行规则
				//画星星
				for(int j =1;j<=(line+1)-i;j++) {
					System.out.print("*");
				}
				//画空格
				for(int j =1;j<=2*i-3;j++) {
					System.out.print(" ");
				}
				//画星星
				for(int j =1;j<=(line+1)-i;j++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}