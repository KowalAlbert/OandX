package com.oandx.logic;

public class Translator {
    private int column = 3;
    private int row = 3;

    public boolean picking (String scanner) {
        if (scanner.equals("a1") || scanner.equals("A1") ||
                scanner.equals("a2") || scanner.equals("A2") ||
                scanner.equals("a3") || scanner.equals("A3") ||
                scanner.equals("b1") || scanner.equals("B1") ||
                scanner.equals("b2") || scanner.equals("B2") ||
                scanner.equals("b3") || scanner.equals("B3") ||
                scanner.equals("c1") || scanner.equals("C1") ||
                scanner.equals("c2") || scanner.equals("C2") ||
                scanner.equals("c3") || scanner.equals("C3")) {

            if (scanner.equals("a1") || scanner.equals("A1")) {
                this.column = 0;
                this.row = 0;
            }
            if (scanner.equals("a2") || scanner.equals("A2")) {
                this.column = 0;
                this.row = 1;
            }
            if (scanner.equals("a3") || scanner.equals("A3")) {
                this.column = 0;
                this.row = 2;
            }
            if (scanner.equals("b1") || scanner.equals("B1")) {
                this.column = 1;
                this.row = 0;
            }
            if (scanner.equals("b2") || scanner.equals("B2")) {
                this.column = 1;
                this.row = 1;
            }
            if (scanner.equals("b3") || scanner.equals("B3")) {
                this.column = 1;
                this.row = 2;
            }
            if (scanner.equals("c1") || scanner.equals("C1")) {
                this.column = 2;
                this.row = 0;
            }
            if (scanner.equals("c2") || scanner.equals("C2")) {
                this.column = 2;
                this.row = 1;
            }
            if (scanner.equals("c3") || scanner.equals("C3")) {
                this.column = 2;
                this.row = 2;
            }
            return true;
        } else {
            return false;
        }
    }

    public int getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }
}
