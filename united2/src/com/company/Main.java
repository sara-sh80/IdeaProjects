package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.9);
        int x = 1000;
        byte b =(byte) x;
        int i = 123456789;
        float f = i;
        System.out.println(f);
        i = (int)f;
        char ch='a';
        System.out.println(++ch);
        System.out.println(--ch);
        int j = 'a';
        char c = 97;
        int Num1,Num2;
        int z = Num1 + Num2;
        int temp;
        int Num1 = (int)(Math.random()*10);
        int Num2 = (int)(Math.random()*10);
        System.out.println("what is Num1 - Num2 ?");
        if(Num1>Num2)
            temp = Num1;
            Num1 = Num2;
            Num2 = temp;
        System.out.println();
        Scanner input = new Scanner(System.nextint);
        if(Scanner%5==0)
            System.out.println("HiFive");
        else
            System.out.println("HiEven");




    }
}
