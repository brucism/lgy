package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
