package yyyf.question;

public class printTriangle {
    public static void main(String[] args){
        fun1();
        System.out.println();
        fun2();
        System.out.println();
        fun3();
    }
    public static void fun1(){
        for(int i = 0;i<=5;i++){
            for(int x = 5;x>i;x--){
                System.out.print(' ');
            }
            for(int j = 0;j<i*2-1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void fun2(){
        for(int i = 0;i<5;i++){
            for(int x = 0;x<i;x++){
                System.out.print(' ');
            }
            for(int j = 9;j>i*2;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void fun3(){
        for(int i = 0;i<5;i++){
            for(int j = 5;j>i;j--){
                System.out.print('*');
            }
            for(int x = 0;x<i;x++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
