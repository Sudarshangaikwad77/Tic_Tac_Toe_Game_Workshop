package com.bl.tictactoe;

public class TicTacToeGame
{
    char [] board;
    public TicTacToeGame() {
        board = new char[10];
        for (int i = 1; i < board.length; i++){
            board[i] = ' ';
        }
    }
    public void displayboard()
    {
        System.out.println(board[1] + " | " + board[2] + " | " +board[3] );
        System.out.println("----------");
        System.out.println(board[4] + " | " + board[5] + " | " +board[6] );
        System.out.println("----------");
        System.out.println(board[7] + " | " + board[8] + " | " +board[9] );
    }
}
