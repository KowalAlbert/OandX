package com.oandx.logic;

public class Engine {
    private int field[][] = new int[3][3]; // O has value of +1 && X has value of -5
    public Engine() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.field[i][j] = 0;
            }
        }
    }

    public boolean checkWin (char side) {
        int sum = 0;
        int condition = 0;
        if (side == 'O') {condition = 3;}   // for O
        if (side == 'X') {condition = -15;} // for X

        //checking columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == condition) {
                return true;
            } else {
                sum = 0;
            }
        }
        // checking rows
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[j][i];
            }
            if (sum == condition) {
                return true;
            } else {
                sum = 0;
            }
        }
        // checking diagonals
        if ((field[0][0] + field[1][1] + field [2][2]) == condition) {
            return true;
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == condition) {
            return true;
        }
        // return false if none is true
        return false;
    }

    public boolean checkTie () {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == 0) {return false;}
            }
        }
        return true;
    }

    public boolean setO (int i, int j) {
        if (field[i][j] == 0) {
            field[i][j] = 1;
            return true;
        } else {
            return false;
        }
    }

    public boolean setX (int i, int j) {
        if (field[i][j] == 0) {
            field[i][j] = -5;
            return true;
        } else {
            return false;
        }
    }

    public int[][] getField() {
        int copyField[][] = new int[3][3];
        System.arraycopy(field, 0, copyField, 0, field.length);
        return copyField;
    }
}
