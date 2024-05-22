package com.example.miprimerproyecto1;

import java.util.Scanner;

public class HelloApplication{
    public static void main(String[] args) {
        int numberA;
        Scanner read=new Scanner(System.in);
        System.out.println("Write the first number:");
        numberA=read.nextInt();
        int numberB;
        Scanner read2=new Scanner(System.in);
        System.out.println("Write the second number:");
        numberB=read2.nextInt();
        int addition=0;
        addition=numberA+numberB;
            System.out.println("Result addition:"+addition);
            double division;
            division= (double) numberA /numberB;
            System.out.println("Result division:"+division );


    }
}