package com.oandx;

import com.oandx.logic.*;
import com.oandx.display.*;

public class OandXMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Board board = new Board();

        boolean winO = false;
        boolean winX = false;
        while (!(winO) && !(winX)) {
            board.display();
            System.out.println("\n Pick an empty square to place your O there: ");
        }
    }
}
