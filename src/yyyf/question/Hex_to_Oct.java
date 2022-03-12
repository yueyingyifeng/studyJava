package yyyf.question;

import java.util.Arrays;
import java.util.Scanner;

public class Hex_to_Oct {
    public static void main(String[] args){
        /*16进制转成8进制*/
        //二进制表0-15
        String[] binary = {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001",
                "1010","1011","1100","1101","1110","1111"};
        //16进制表0-15
        String[] hex = {"0","1","2","3","4","5","6","7","8","9",
                "A","B","C","D","E","F"};
        //8进制表0-7
        String[] oct = {"0","1","2","3","4","5","6","7"};
        //接收16进制数
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();//接收n行
        //保存输入的16进制数
        String[] HEX = new String[n];
        for(int i=0;i<n;i++){
            HEX[i]=scanner.next();//接收输入的16进制数
        }
        scanner.close();
        //1.先把16进制转成2进制
        for(int i =0;i<HEX.length;i++){//遍历保存16进制的数组
            String temp = HEX[i];
            //保存16进制转换后的2进制
            StringBuffer BIN = new StringBuffer();
            //保存2进制转换后的8进制
            StringBuffer OCT = new StringBuffer();
            //遍历每个16进制数的位数字
            for(int k=0;k<temp.length();k++){
                char c = temp.charAt(k);
                //查询数字在16进制数组中对应的下标
                int index= Arrays.binarySearch(hex, c+"");
                BIN.append(binary[index]);
            }
            //System.out.println(BIN);
            //补位0，让二进制数的长度是3的倍数
            String receiveBIN = BIN.toString();
            if (receiveBIN.length()%3==1) {
                receiveBIN="00"+receiveBIN;
            }else if (receiveBIN.length()%3==2) {
                receiveBIN="0"+receiveBIN;
            }
            //2.再把2进制转成8进制
            String saveOCT;//临时存储二进制数
            int L = receiveBIN.length();
            for(int t=0;t<receiveBIN.length()/3;t++){
                saveOCT = receiveBIN.substring(3*t,3*t+3);
//				System.out.println(receiveBIN+":"+saveOCT);
                //查询二进制每次三位数在2进制数组中的位置
                int index = Arrays.binarySearch(binary, "0"+saveOCT);
                //根据下标替换相对应的8进制数
                OCT.append(oct[index]);
            }
            while(OCT.charAt(0)=='0'&&OCT.length()>1){
                OCT.delete(0, 1);
            }
            System.out.println(OCT);
        }

    }
}
