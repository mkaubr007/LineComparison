package com.biz.line.comparison;

import java.util.Scanner;


public class LineCompareUC1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("enter the value for line x1,x2,y1,y2");
=======
        System.out.println("For line first enter x1,x2,y1,y2");
>>>>>>> UC2
        Integer x1=sc.nextInt();
        Integer x2=sc.nextInt();
        Integer y1=sc.nextInt();
        Integer y2=sc.nextInt();
        System.out.println("For line second enter x3,x4,y3,y4");
        Integer x3=sc.nextInt();
        Integer x4=sc.nextInt();
        Integer y3=sc.nextInt();
        Integer y4=sc.nextInt();
        Integer length1=(int)Math.sqrt(x2-x1)^2+(y2-y1)^2;
        Integer length2=(int)Math.sqrt(x4-x3)^2+(y4-y3)^2;
        System.out.println(length1.equals(length2));
    }
}

