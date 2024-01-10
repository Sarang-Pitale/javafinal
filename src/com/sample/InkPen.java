package com.sample;

public final class InkPen extends Pen{ // final class
    int nip;

    void write(String color) {
        inkColor=color;
        super.write("green");
        System.out.println(super.inkColor);
        System.out.println("I am writing with " + inkColor + " color using InkPen");
    }
   /* void hold(){  cannot override the final method

    }*/
}
