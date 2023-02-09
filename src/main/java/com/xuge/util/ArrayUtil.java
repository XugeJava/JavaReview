package com.xuge.util;

/**
 * @author : yangjiangxu
 * @effect : 当前类的作用是数组工具类
 * @projectTeam : 研发二组/小程序组
 * @since 2022/12/30 : 16:19
 */
public class ArrayUtil {
    /**
     * 反转数组
     *
     * @param arr 目标数组
     */
    public static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[index++] = arr[i];
        }
        arr = temp;
        return arr;
    }

    /**
     * 原始实现
     *
     * @param arr    数组
     * @param target 加入数组尾端的数
     */
    public static int[] arrayAdd(int[] arr, int target) {
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length - 1] = target;
        return temp;
    }

    /**
     * 删除数组元素
     * @param arr 数组
     */
    public static int[] arrayDeduce(int []arr){
        if(arr.length==0){
            System.out.println("不可再缩减长度了");
        }
        int[] temp = new int[arr.length -1];
        for (int i = 0; i < arr.length-1; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }



    public static void main(String[] args) {
        //测试功能
        int[] arr = {1, 2, 3, 4, 5};
//        arr=reverseArray(arr);
//        for(int i:arr){
//            System.out.println(i);
//        }
//        System.out.println("测试扩容数组");
//        //测试扩容数组
//        arr=arrayAdd(arr,6);
//        for(int i:arr){
//            System.out.println(i);
//        }
//        do {
//            System.out.println("请输入你要添加的元素");
//            arr = arrayAdd(arr, ScannerUtil.printInt());
//            System.out.println("添加后，当前数组为:");
//            for (int i : arr) {
//                System.out.print(i+"\t");
//            }
//            System.out.println();
//            System.out.println("是否继续添加.. y/n");
//            char c = ScannerUtil.printChar();
//            if (c == 'n') {
//                break;
//            }
//        } while (true);


        do {
            arr = arrayDeduce(arr);
            if(arr.length==0){
                System.out.println("数组为空，不可继续删除了...");
                break;
            }
            System.out.println("删除后，当前数组为:");
            for (int i : arr) {
                System.out.print(i+"\t");
            }
            System.out.println();
            System.out.println("是否继续删除.. y/n");
            char c = ScannerUtil.printChar();
            if (c == 'n') {
                break;
            }
        } while (true);
    }
}
