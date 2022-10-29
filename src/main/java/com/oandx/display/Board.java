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

    public void display(int field[][]) {
        if (field[0][0] == 1) {a1 = 'O';}
        if (field[0][0] == -5) {a1 = 'X';}

        if (field[0][1] == 1) {a2 = 'O';}
        if (field[0][1] == -5) {a2 = 'X';}

        if (field[0][2] == 1) {a3 = 'O';}
        if (field[0][2] == -5) {a3 = 'X';}

        if (field[1][0] == 1) {b1 = 'O';}
        if (field[1][0] == -5) {b1 = 'X';}

        if (field[1][1] == 1) {b2 = 'O';}
        if (field[1][1] == -5) {b2 = 'X';}

        if (field[1][2] == 1) {b3 = 'O';}
        if (field[1][2] == -5) {b3 = 'X';}

        if (field[2][0] == 1) {c1 = 'O';}
        if (field[2][0] == -5) {c1 = 'X';}

        if (field[2][1] == 1) {c2 = 'O';}
        if (field[2][1] == -5) {c2 = 'X';}

        if (field[2][2] == 1) {c3 = 'O';}
        if (field[2][2] == -5) {c3 = 'X';}

        System.out.println("    a b c ");
        System.out.println("1  |" + a1 + "|" + b1 + "|" + c1 + "|");
        System.out.println("2  |" + a2 + "|" + b2 + "|" + c2 + "|");
        System.out.println("3  |" + a3 + "|" + b3 + "|" + c3 + "|");
    }
}
