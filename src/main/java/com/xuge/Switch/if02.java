package com.xuge.Switch;

import com.xuge.util.ScannerUtil;

import java.util.Scanner;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 14:54
 */
public class if02 {
    public static void main(String[] args) {
        Scanner in = ScannerUtil.getScanner();
        int age=in.nextInt();
        if(age>18){
            System.out.println("你的年龄大于18岁,需要为自己负责");
        }else{
            System.out.println("你的年龄不大，放过你了");
        }
    }
}
