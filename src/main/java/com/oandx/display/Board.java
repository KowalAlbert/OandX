package com.oandx.display;

public class Board {
    private char a1 = ' ';
    private char a2 = ' ';
    private char a3 = ' ';
    private char b1 = ' ';
    private char b2 = ' ';
    private char b3 = ' ';
    private char c1 = ' ';
    private char c2 = ' ';
    private char c3 = ' ';

    public void display() {
        System.out.println("    a b c ");
        System.out.println("1  |" + a1 + "|" + b1 + "|" + c1 + "|");
        System.out.println("2  |" + a2 + "|" + b2 + "|" + c2 + "|");
        System.out.println("3  |" + a3 + "|" + b3 + "|" + c3 + "|");
    }

    public void setA1(char a1) {
        this.a1 = a1;
    }
    public void setA2(char a2) {
        this.a2 = a2;
    }
    public void setA3(char a3) {
        this.a3 = a3;
    }
    public void setB1(char b1) {
        this.b1 = b1;
    }
    public void setB2(char b2) {
        this.b2 = b2;
    }
    public void setB3(char b3) {
        this.b3 = b3;
    }
    public void setC1(char c1) {
        this.c1 = c1;
    }
    public void setC2(char c2) {
        this.c2 = c2;
    }
    public void setC3(char c3) {
        this.c3 = c3;
    }
}
