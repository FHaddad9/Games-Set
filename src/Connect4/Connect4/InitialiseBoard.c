#include "InitialiseBoard.h"
#include <stdio.h>


//initialising players, filing out their details
void initPlayers(player players[PLAYERS_NUM]){

    printf("Input player 1's name (RED): ");
    scanf("%s", players[0].name);
    players[0].playerColour=RED;
    players[0].piecesOnBoard=0;

    printf("Input player 1's name (YELLOW): ");
    scanf("%s", players[1].name);
    players[1].playerColour=YELLOW;
    players[1].piecesOnBoard=0;

    printf("\n");
}

//sets square invalid to land a piece
void setInvalid(square * s){
s->type = INVALID;
}

//sets square valid to land a piece
void setValid(square * s){
s->type = VALID;
}

//set square to white colour
void setYellow(square * s){
s->squareColour = YELLOW;
}

//set square to black colour
void setRed(square * s){
s->squareColour = RED;
}

//set square to neutral colour
void setNeutral(square * s){
s->squareColour = NEUTRAL;
}

//initializes the board
void initBoard(square board [BOARD_X][BOARD_Y]) {

    //puts 2 white and black pieces to middle of board
    //rest of board is empty and valid to place piece
    for (int i = 0; i < BOARD_X; i++) {
        for (int j = 0; j < BOARD_Y; j++) {


            if(i == BOARD_X-1) {
                setValid(&board[i][j]);
                setNeutral(&board[i][j]);
            } else {
                setInvalid(&board[i][j]);
                setNeutral(&board[i][j]);
            }
        }
    }
}

//prints board
void printBoard(square board[BOARD_X][BOARD_Y]) {
    int colNum = 6;
    printf("\n\t");

    for (int i = 0; i < BOARD_X; i++) {
        printf("%d  ", colNum);
        printf("|");
        for (int j = 0; j < BOARD_Y; j++) {
            if(board[i][j].squareColour == RED){
                printf("(R)");
            }
            else if(board[i][j].squareColour == YELLOW){
                printf("(Y)");
            }
            else if (board[i][j].type == VALID) {
                printf("(I)");
            } else if (board[i][j].type == INVALID) {
                printf("( )");
            }
        }
        printf("|\n");
        printf("\t");

        colNum--;
    }
    printf("\n\t     a  b  c  d  e  f  g");
}
