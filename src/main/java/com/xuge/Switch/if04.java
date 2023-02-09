package com.xuge.Switch;

import com.xuge.util.ScannerUtil;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 15:37
 */
public class if04 {
    public static void main(String[] args) {
        double score= ScannerUtil.printDouble();
        char gender=ScannerUtil.printChar();
        if(score>=0&&score<=10){
            if(score>8.0){
                if(gender=='男'){
                    System.out.println("进入男子组");
                }else if(gender=='女'){
                    System.out.println("进入女子组");
                }else{
                    System.out.println("你输入的性别不符合规则");
                }
            }else{
                System.out.println("你被淘汰了..");
            }
        }else{
            System.out.println("你输入的成绩需在0-10之间");
        }

    }
}
