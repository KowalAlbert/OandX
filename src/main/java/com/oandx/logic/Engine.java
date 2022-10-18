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

    public boolean checkWinO () {
        int sum = 0;
        //checking columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == 3) {
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
            if (sum == 3) {
                return true;
            } else {
                sum = 0;
            }
        }
        // checking diagonals
        if ((field[0][0] + field[1][1] + field [2][2]) == 3) {
            return true;
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == 3) {
            return true;
        }
        // return false if none is true
        return false;
    }

    public boolean checkWinX () {
        int sum = 0;
        //checking columns
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == -15) {
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
            if (sum == -15) {
                return true;
            } else {
                sum = 0;
            }
        }
        // checking diagonals
        if ((field[0][0] + field[1][1] + field [2][2]) == -15) {
            return true;
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == -15) {
            return true;
        }
        // return false if non is true
        return false;
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
        return field;
    }
}
