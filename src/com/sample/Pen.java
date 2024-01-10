package com.sample;

class Pen { //Super class or parent class or base class
    final int size = 15;  // final variable
    String inkColor;

    Pen() {

        inkColor = "Red";
    }

    void write(String color) {
        inkColor = color;
        System.out.println("I am writing with " + inkColor + " color using Pen");
    }

    final void hold() {  //final method cannot be
        System.out.println("You are holding a pen");
    }


}

