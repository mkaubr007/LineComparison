package com.biz.line.comparison;

import java.util.Scanner;


public class LineCompareUC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value for line x1,x2,y1,y2");
        Integer x1=sc.nextInt();
        Integer x2=sc.nextInt();
        Integer y1=sc.nextInt();
        Integer y2=sc.nextInt();
        Integer length=(int)Math.sqrt(x2-x1)^2+(y2-y1)^2;
        System.out.println("length :"+length);
    }
}

