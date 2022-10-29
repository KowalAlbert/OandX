package com.oandx.logic;

import java.util.Random;

public class Opponent {
    private int column;
    private int row;

    public void analyze(int field[][]) {
        Random ranGen = new Random();
        int sum = 0;
        boolean pick = false;
        // CHECKING FOR X WIN
        //checking columns for X
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == -10 && pick == false) {
                if (field[i][0] == 0) {
                    this.column = i;
                    this.row = 0;
                }
                if (field[i][1] == 0) {
                    this.column = i;
                    this.row = 1;
                }
                if (field[i][2] == 0) {
                    this.column = i;
                    this.row = 2;
                }
                pick = true;
            } else {
                sum = 0;
            }
        }
        // checking rows for X
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[j][i];
            }
            if (sum == -10 && pick == false) {
                if (field[0][i] == 0) {
                    this.column = 0;
                    this.row = i;
                }
                if (field[1][i] == 0) {
                    this.column = 1;
                    this.row = i;
                }
                if (field[2][i] == 0) {
                    this.column = 2;
                    this.row = i;
                }
                pick = true;
            } else {
                sum = 0;
            }
        }
        // checking diagonals for X
        if ((field[0][0] + field[1][1] + field [2][2]) == -10 && pick == false) {
            if (field[0][0] == 0) {
                this.column = 0;
                this.row = 0;
            }
            if (field[1][1] == 0) {
                this.column = 1;
                this.row = 1;
            }
            if (field[2][2] == 0) {
                this.column = 2;
                this.row = 2;
            }
            pick = true;
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == -10 && pick == false) {
            if (field[0][2] == 0) {
                this.column = 0;
                this.row = 2;
            }
            if (field[1][1] == 0) {
                this.column = 1;
                this.row = 1;
            }
            if (field[2][0] == 0) {
                this.column = 2;
                this.row = 0;
            }
            pick = true;
        }
        // CHECKING FOR O WIN
        //checking columns for O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[i][j];
            }
            if (sum == 2 && pick == false) {
                if (field[i][0] == 0) {
                    this.column = i;
                    this.row = 0;
                }
                if (field[i][1] == 0) {
                    this.column = i;
                    this.row = 1;
                }
                if (field[i][2] == 0) {
                    this.column = i;
                    this.row = 2;
                }
                pick = true;
            } else {
                sum = 0;
            }
        }
        // checking rows for O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum = sum + field[j][i];
            }
            if (sum == 2 && pick == false) {
                if (field[0][i] == 0) {
                    this.column = 0;
                    this.row = i;
                }
                if (field[1][i] == 0) {
                    this.column = 1;
                    this.row = i;
                }
                if (field[2][i] == 0) {
                    this.column = 2;
                    this.row = i;
                }
                pick = true;
            } else {
                sum = 0;
            }
        }
        // checking diagonals for O
        if ((field[0][0] + field[1][1] + field [2][2]) == 2 && pick == false) {
            if (field[0][0] == 0) {
                this.column = 0;
                this.row = 0;
            }
            if (field[1][1] == 0) {
                this.column = 1;
                this.row = 1;
            }
            if (field[2][2] == 0) {
                this.column = 2;
                this.row = 2;
            }
            pick = true;
        }
        if ((field[2][0] + field[1][1] + field [0][2]) == 2 && pick == false) {
            if (field[0][2] == 0) {
                this.column = 0;
                this.row = 2;
            }
            if (field[1][1] == 0) {
                this.column = 1;
                this.row = 1;
            }
            if (field[2][0] == 0) {
                this.column = 2;
                this.row = 0;
            }
            pick = true;
        }

        if (pick == false) {
            for (; pick != true;)
            {
                this.column = ranGen.nextInt(3);
                this.row = ranGen.nextInt(3);
                if (field[column][row] == 0) {
                    pick = true;
                }
            }
        }
    }

    public int getColumn () {
        return column;
    }

    public int getRow () {
        return row;
    }
}
