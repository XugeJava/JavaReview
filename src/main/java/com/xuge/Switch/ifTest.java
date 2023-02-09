package com.xuge.Switch;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 15:03
 */
public class ifTest {
    public static void main(String[] args) {
        //判断是否是闰年
        int year=2019;
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("当前"+year+"是闰年");
        }else{
            System.out.println("当前"+year+"不是闰年");
        }
    }
}
