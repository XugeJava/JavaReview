package com.xuge.Switch;

import com.xuge.util.ScannerUtil;

import java.util.Scanner;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 15:33
 */
public class if03 {
    public static void main(String[] args) {
        Scanner in = ScannerUtil.getScanner();
        int score=in.nextInt();
        if(score>=0&&score<=100){
            if(score==100){
                System.out.println("你的信用极好");
            }else if(score>80&&score<=99){
                System.out.println("你的信用优秀");
            }else if(score>=60&&score<80){
                System.out.println("你的信用一般");
            }else {
                System.out.println("信用不及格");
            }
        }else{
            System.out.println("你输入的信誉分需要在0-100之间");
        }



    }
}
