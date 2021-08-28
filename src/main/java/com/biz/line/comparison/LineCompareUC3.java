package com.biz.line.comparison;


import java.util.Scanner;


public class LineCompareUC3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 value");
        Integer x1=sc.nextInt();
        System.out.println("enter x2 value");
        Integer x2=sc.nextInt();
        System.out.println("enter y1 value");
        Integer y1=sc.nextInt();
        System.out.println("enter y2 value");
        Integer y2=sc.nextInt();
        Integer length1=(int)Math.sqrt(x2-x1)^2;
        Integer length2=(int)Math.sqrt(y2-y1)^2;
        System.out.println(length1.compareTo(length2));
    }
}


