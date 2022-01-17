#include <stdio.h>
#include <stdlib.h>
#include "InitialiseBoard.h"

int main(){
    //declaration of the board
    square board[BOARD_X][BOARD_Y];
    player players[PLAYERS_NUM];

    printf("*** Welcome to Othello! ***\n");

    //initialising the players
    initPlayers(players);

    //initialising the board
    initBoard(board);

    //print the board before starting
    printBoard(board);
}
