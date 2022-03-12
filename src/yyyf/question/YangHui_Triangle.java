package yyyf.question;

import java.util.Scanner;

public class YangHui_Triangle {
    public static void main(String[] args)
    {
        fun1();
        outside();
    }

    static void fun1(){
        Scanner input = new Scanner(System.in);//输入行数
        int length = input.nextInt();
        int[][] map = new int[length][length];

        for(int row = 0;row < map.length;row++){
            map[row][0] = 1;
            map[row][row] = 1;
        }

        for(int row = 1;row< map.length;row++){
            for(int col = 1;col<map[row].length;col++){
                if(map[row][col] != 1){
                    map[row][col] = map[row - 1][col - 1] + map[row -1][col];
                }
            }
        }

        for(int[] row:map){
            for(int col:row){
                if(col != 0){
                    System.out.print(col);
                }
            }
            System.out.println();
        }

    }

    static void trang(int height){//2021年10月22日
        int[][] t = new int[height][height];//正方形
        for(int y = 0;y<height;y++){//先初始化二维数组--将边弄出来
            for(int x = 0;x < height; x++){
                t[y][0] = 1;
                t[y][y] = 1;
            }
        }
        //根据数组的坐标系统，可以知道离中心的左上方是（-1,-1)，而上方则是(-1,0)通过这两个就可以获取上面两个需要加的地方
        for(int y = 0;y<height;y++){
            for(int x = 0;x < height; x++){
                if(x >= 1 && y > 1 && x != y){
                    t[y][x] = t[y - 1][x] + t[y - 1][x];
                }
            }
        }

        for(int y = 0;y<height;y++){//输出
            for(int x = 0;x < height; x++){
                System.out.print(t[y][x] + " ");
            }
            System.out.println();
        }
    }

    static void outside(){
        //百度百科的
        final int NMAX = 10;

        // allocate triangular array
        int[][] odds = new int[NMAX + 1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill triangular array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++)
            {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;

                odds[n][k] = lotteryOdds;
            }

        // print triangular array
        for (int[] row : odds)
        {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
    }

}
