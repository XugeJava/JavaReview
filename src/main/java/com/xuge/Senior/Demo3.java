package com.xuge.Senior;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 14:27
 */
public class Demo3 {
    public static void main(String[] args) {
        //低->高  byte-short-char-int -long -float-double
        int i=128;
        byte b=(byte)i;
        //内存溢出
        double   b1=i;
        System.out.println(i);
        System.out.println(b);
        System.out.println(b1 );

        /*
          1.不能对布尔类型转换
          2.不能将对象类型转换为不相干的类型
          3.在把高容量转换到低容量时，强制转换
          4.转换的时间可能存在内存溢出问题，或者精度问题
         */
        System.out.println("==================================");
        System.out.println((int)123.7);
        System.out.println((int)-45.89f);
        System.out.println("==================================");
        char c1='a';
        int c=c1+1;
        System.out.println(c);
        System.out.println((char)c);


        //操作溢出
        // 操作比较大时，注意溢出
        // JDK7新特性，数字之间可以用下划线分割
//        int money = 10_0000_0000;
//        System.out.println(money);
//        int years = 20;
//        int total = money*years;    //  -1474836480  计算时溢出
//        System.out.println(total);
//        long total2 = money*years;
//        System.out.println(total2);    // 默认是int，转换之前已经存在问题了!!!
//        long total3 = money*(long)years;
//        System.out.println(total3);     // 20000000000

    }
}
