package yyyf.question;

import java.util.Scanner;
/*
f(0) = 1
f(1) = 1
f(2) = f(0)+f(1)
 */
public class Fibonacci
{
    static void pikeOne(int n){
        int[] F=new int[n+2];//定义一个名为F的数组
        F[1]=F[2]=1;//头两个为1
        if(n>2){
            for(int i=3;i<=n;i++){
                F[i]=(F[i-1]+F[i-2])%10007;
            }
        }
        System.out.println(F[n]);
    }

    static void many(int length){
        int a, b = 1, c = 0;
        for(int n = 0;n < length;n++){
            a = b;
            b = c;
            c = a + b;
            System.out.print(c + " ");
        }
    }



//1 1 2 3 5 8 13
        public static void main(String[] args){

        }
}
