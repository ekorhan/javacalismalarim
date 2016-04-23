package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int s = (int) Math.pow(10,9);
        System.out.println("s="+s);
        int n=r.nextInt(s);
        System.out.println("n="+n);
        while(n<10) {
            n = r.nextInt(s);
        }
        System.out.println("n="+n);
        int k=r.nextInt(s);
        System.out.println("k="+k);
        int a = (int) Math.pow(n,k);
        a=a%100;
        System.out.println(a);
    }
}
