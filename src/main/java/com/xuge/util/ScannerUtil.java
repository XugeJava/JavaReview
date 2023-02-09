package com.xuge.util;

import java.util.Scanner;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 14:52
 */
public class ScannerUtil {
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
    /**
     * 获取int
     */
    public static  int printInt(){
        Scanner in = getScanner();
        return in.nextInt();
    }
    /**
     * 获取字符
     */
    public static char printChar(){
        Scanner in = getScanner();
        return in.next().charAt(0);
    }
    /**
     * 接受double
     */
    public static double printDouble(){
        Scanner in = getScanner();
        return in.nextDouble();
    }
}
