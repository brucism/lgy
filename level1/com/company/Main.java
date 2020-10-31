package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("请输出数字；");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        int y = x % 2;
        if (y == 1) {
            boolean flag =false ;

            System.out.println("" + flag);
        } else {
            boolean flag = true;
            System.out.println("" + flag);


        }
    }
}