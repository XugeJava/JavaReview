package com.xuge.Switch;

import com.xuge.util.ScannerUtil;

import java.util.Scanner;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 14:51
 */
public class if01 {
    public static void main(String[] args) {
        Scanner scanner = ScannerUtil.getScanner();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        if(age>18){
            System.out.println("你年龄大于18，需要为自己负责");
        }
        System.out.println("程序继续");
    }
}
