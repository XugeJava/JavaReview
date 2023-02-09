package com.xuge.Senior;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 14:08
 */
public class Demo2 {
    public static void main(String[] args) {
        //整数

        //浮点数

        //字符
        //所有字符的本质还是数字
        //编码 Unicode 2字节  0-65536
        char c1='\u0062';
        System.out.println(c1);
        //转义字符
        //\t 制表符
        //\n换行
        System.out.println("hello\tworld");
        System.out.println("hello\nworld");
        System.out.println("================");
        String s1 = new String("hello world");
        String s2 = new String("hello world");
        System.out.println(s1==s2);
        String sc="hello world";
        String sd="hello world";
        System.out.println(sc==sd);
        //布尔值扩展
        boolean flag=true;
        if(flag){
            System.out.println("hh");
        }

    }
}
