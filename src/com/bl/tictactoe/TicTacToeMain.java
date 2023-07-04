package com.bl.tictactoe;

import java.util.Scanner;

public class TicTacToeMain
{
    public static void main(String[] args) {
        System.out.println("welcome to TicTacToe Game...");
        System.out.println(" do you want to play as player or computer . choose X OR O");
        Scanner scanner = new Scanner(System.in);
        char playerletter = scanner.nextLine().charAt(0);
        TicTacToeGame game = new TicTacToeGame(playerletter);
        game.displayboard();
    }
}
