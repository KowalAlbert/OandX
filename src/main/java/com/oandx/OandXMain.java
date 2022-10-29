package com.oandx;

import com.oandx.logic.*;
import com.oandx.display.*;

import java.util.Scanner;

public class OandXMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Engine engine = new Engine();
        Board board = new Board();
        Opponent opponent = new Opponent();
        Translator translator = new Translator();

        boolean winO = false;
        boolean winX = false;
        boolean tie = false;
        while (!(winO) && !(winX) && !(tie)) {
            board.display(engine.getField());    // pokazuje plansze
            System.out.println("\n Pick an empty square to place your O there: ");
            String input = scanner.nextLine();
            translator.picking(input);

            while (!(translator.picking(input)) || !(engine.setO(translator.getColumn(), translator.getRow())) ) {
                System.out.println("\n Incorrect choice!");
                System.out.println("Pick an empty square to place your O there: ");
                input = scanner.nextLine();
                translator.picking(input);
            }
            if (engine.checkWin('O')) {winO = true;} else {
                if (engine.checkTie()) {
                    tie = true;
                } else {
                    board.display(engine.getField());
                    System.out.println("Opponent is thinking...");
                    Thread.sleep(1500);
                    opponent.analyze(engine.getField());
                    engine.setX(opponent.getColumn(), opponent.getRow());
                    if (engine.checkWin('X')) {winX = true;}
                }
            }
        }

        board.display(engine.getField());
        System.out.println("\n End of the game!");
        if (winO) {System.out.println("You won!");}
        if (winX) {System.out.println("You lost.");}
        if (tie) {System.out.println("You tied.");}
        Thread.sleep(5000);
    }
}
