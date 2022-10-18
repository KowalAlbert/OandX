package com.oandx.logic;

public class Opponent {
    private int column;
    private int row;

    public void analyze(int field[][]) {
        int sum = 0;
        // CHECKING FOR X WIN
        //checking columns for X
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == -10) {
                if (field[i][0] == 0) {
                    column = i;
                    row = 0;
                }
                if (field[i][1] == 0) {
                    column = i;
                    row = 1;
                }
                if (field[i][2] == 0) {
                    column = i;
                    row = 2;
                }
            } else {
                sum = 0;
            }
        }
        // checking rows for X
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[j][i];
            }
            if (sum == -10) {
                if (field[0][i] == 0) {
                    column = 0;
                    row = i;
                }
                if (field[1][i] == 0) {
                    column = 1;
                    row = i;
                }
                if (field[2][i] == 0) {
                    column = 2;
                    row = i;
                }

            } else {
                sum = 0;
            }
        }
        // checking diagonals for X
        if ((field[0][0] + field[1][1] + field [2][2]) == -10) {
            if (field[0][0] == 0) {
                column = 0;
                row = 0;
            }
            if (field[1][1] == 0) {
                column = 1;
                row = 1;
            }
            if (field[2][2] == 0) {
                column = 2;
                row = 2;
            }
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == -10) {
            if (field[0][2] == 0) {
                column = 0;
                row = 2;
            }
            if (field[1][1] == 0) {
                column = 1;
                row = 1;
            }
            if (field[2][0] == 0) {
                column = 2;
                row = 0;
            }
        }
        // CHECKING FOR O WIN
        //checking columns for O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == 2) {
                if (field[i][0] == 0) {
                    column = i;
                    row = 0;
                }
                if (field[i][1] == 0) {
                    column = i;
                    row = 1;
                }
                if (field[i][2] == 0) {
                    column = i;
                    row = 2;
                }
            } else {
                sum = 0;
            }
        }
        // checking rows for O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[j][i];
            }
            if (sum == 2) {
                if (field[0][i] == 0) {
                    column = 0;
                    row = i;
                }
                if (field[1][i] == 0) {
                    column = 1;
                    row = i;
                }
                if (field[2][i] == 0) {
                    column = 2;
                    row = i;
                }

            } else {
                sum = 0;
            }
        }
        // checking diagonals for O
        if ((field[0][0] + field[1][1] + field [2][2]) == 2) {
            if (field[0][0] == 0) {
                column = 0;
                row = 0;
            }
            if (field[1][1] == 0) {
                column = 1;
                row = 1;
            }
            if (field[2][2] == 0) {
                column = 2;
                row = 2;
            }
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == 2) {
            if (field[0][2] == 0) {
                column = 0;
                row = 2;
            }
            if (field[1][1] == 0) {
                column = 1;
                row = 1;
            }
            if (field[2][0] == 0) {
                column = 2;
                row = 0;
            }
        }
    }
}
