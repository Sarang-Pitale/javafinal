package com.sample;


public class Demo {
    public static void main(String[] args) {
       DotPen aPen=new DotPen();
        System.out.println(aPen.inkColor);
        aPen.write("Red");
        aPen.changeRefill();
        InkPen fPen=new InkPen();
        fPen.write("Blue");
        final DotPen fixPen=new DotPen();
       // fixPen=new DotPen(); // final reference cannot be modified
    }
}
