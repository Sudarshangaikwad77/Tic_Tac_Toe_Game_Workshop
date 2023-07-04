package com.bl.tictactoe;

public class TicTacToeGame
{
    char [] board;
    char playerletter ;
    char computerletter;
    public TicTacToeGame(char playerletter) {
        board = new char[10];
        for (int i = 1; i < board.length; i++){
            board[i] = ' ';
        }
        this.playerletter = playerletter;
        this.computerletter = (playerletter == 'x') ? 'o' : 'x';
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
