package com.company;

import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {
        System.out.println(addition(10));
        System.out.println( "    *****     " );
        System.out.println(addition1(10));
        System.out.println( "    *****     " );
        System.out.println(addition2(10));
        System.out.println( "    *****     " );
        System.out.println(sommedeNombresPair(10));
        System.out.println( "    *****     " );
        System.out.println(sommedeNombresPair2(10));// 2 4 6 8 10 12 14 16 18 20
        System.out.println( "    *****     " );
        System.out.println(additionNombresImpairs(10)); // 1 3 5 7 9 11 13 15 17 19
        System.out.println( "    *****     " );
        System.out.println(premierXpuissanceDeux(10));

    }

    //Structured Programming
    public static int addition(int x) {
        int total = 0;
        for (int i = 0; i <= x; i++) {
            total += i;
        }
        return total;
    }

    //Functional Programming
    public static int addition1(int x) {
        return IntStream.range(1, x + 1).
                sum();
    }
    public static int addition2(int x) {
        return IntStream.rangeClosed(1,x).
                sum();
    }
    public static int sommedeNombresPair(int x) {
        return IntStream.rangeClosed(1,x).
                filter(t->t%2==0).
                sum();
    }
    public static int sommedeNombresPair2(int x) {
        return IntStream.
                iterate(2,t->t + 2).
                limit(x).
                sum();
    }
    public static int additionNombresImpairs (int x) {
        return IntStream.
                iterate(1, t -> t + 2).
                limit(x).
                sum();
    }
    public static int premierXpuissanceDeux (int x) {
        return IntStream.
                iterate(2, t -> t * 2).
                limit(x).
                sum();

    }


    //premier x puissance de deux
}











