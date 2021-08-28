package com.biz.line.comparison;

import java.util.Scanner;

public class LineCompareUC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x1 value");
        int x1=sc.nextInt();
        System.out.println("enter x2 value");
        int x2=sc.nextInt();
        System.out.println("enter y1 value");
        int y1=sc.nextInt();
        System.out.println("enter y2 value");
        int y2=sc.nextInt();
        int length=(int)Math.sqrt((x2-x1)^2+(y2-y1)^2);
        System.out.println("length: "+length);
    }
}
