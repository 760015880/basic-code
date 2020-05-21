package com.hupan.day01.demo3;
/**
@author hupan
 */
public class Demo03Methodprint {
    public static void main(String[] args) {
        printcount(5);
    }
    public static void printcount(int num){
        for (int i = 1; i < num; i++) {
            System.out.println("打印的次数为" + i);
            System.out.println("打印的次数" + i);
        }
    }
}
