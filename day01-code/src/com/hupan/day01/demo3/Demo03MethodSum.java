package com.hupan.day01.demo3;
/**
 @author hupan
 */
/*定义一个方法，用来求出1-100所有数字和的值*/

public class Demo03MethodSum {
    public static void main(String[] args) {
        System.out.println(getsum());
    }
    /*
    三要素
    返回值：计算结果是一个int数字
    方法名称：getsum
    参数列表：数据范围已经确定，是固定的；
     */


    public static int getsum() {
        System.out.println("执行了");
    int sum = 0;
    for (int i=0;i<=100;i++){
        sum += i ;
    }
    return sum;
    }
}
