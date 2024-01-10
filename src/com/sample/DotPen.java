package com.sample;

class DotPen extends Pen { //Sub class or child class or derived class
    int ball;
    DotPen() {
        inkColor="Blue";
        ball = 1;
    }

    void changeRefill() {
        System.out.println("Changed with ball " + ball);
    }

    void write(String color) {
        inkColor=color;
        System.out.println("I am writing with " + inkColor + " color using DotPen");
    }

}