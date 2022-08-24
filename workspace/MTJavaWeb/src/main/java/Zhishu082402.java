public class Zhishu082402{
	public static void main(String[] args) {
		for(int num=2;num<=100;num++) {           //循环遍历数字
			boolean x = false;                    //做标识
			for(int i=2;i<=num-1;i++) {           //循环遍历除数
				if(num%i == 0) {                  //判断是不是质数
					System.out.println(num+"不是质数");
					x = true;                     //修改标识
					break;                        //不是中断if   当满足if语句时中断i循环
				}
			}
			if(x == false) {                      //若标识未改变，则未执行if循环，即无能被整除的数，为质数
				System.out.println(num+"是质数");
			}
		}
	}
}