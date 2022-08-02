public class Test001 {
    public static void main(String[] args) {
        //定义变量
        int i,j,q;
        //打印菱形的上半部分，左边打印倒直角三角形的空格，右边打印等腰三角形
        for( i = 1;i < 6; i ++) //外循环控制行数，共打印五行
        {
            //左边打印倒直角三角形空格
            for( j = 5; j > i; j--) //与外循环关联，初始值不变，表达式变化，控制打印的列数
            {
                System.out.print(" ");
            }
            //右边等腰三角形
            for( q = 1;q < i*2; q++) //与外循环关联，初始值不变，表达式变化，打印奇数列1，3，5，7，9
            {
                System.out.print("*");
            }
            System.out.println();    //换行
        }
        //打印菱形的下半部分，左边为直角三角形的空格，右边为倒的等腰三角形
        for(i = 1; i < 5; i++) //外循环控制行数，共打印四行
        {
            //左边直角三角形空格
            for(j = 1;j <= i; j++) {    //与外循环关联，初始值不变，表达式变化，共打印五行
                System.out.print(" ");
            }
            //右边倒直角三角形
            for( q = i*2; q < 9 ; q++) {    //与外循环关联，初始值变化，表达式不变，打印奇数列7，5，3，1
                System.out.print("*");
            }
            System.out.println();    //换行
        }
    }
}