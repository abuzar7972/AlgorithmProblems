package com.bl.programs;

public class PrimeNumber_07 {
    public static void main(String[] args) {
        System.out.println("Prime number between 0-1000 are");
        for (int num=0; num<1000;num++) {
            int i, m = 0, flag = 0;
            m = num / 2;
            if (num == 0 || num == 1) {
                System.out.println(num + " not a prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (num % i == 0) {
                        System.out.println(num + " not a prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(num + " is a prime number");
                }
            }
        }
    }
}
