#include "CheckMove.h"
#include "InitialiseBoard.h"
#include <stdio.h>

void checkValidSquare(square board[BOARD_X][BOARD_Y], player players[PLAYERS_NUM], int x, int y, int playerNum){
    //if(board[x][y].type == VALID) {
  //      board[x][y].squareColour = players.playerColour.RED;
//
//    }
}

void checkWin(square board[BOARD_X][BOARD_Y, player players[PLAYERS_NUM], int x, int y, int playerNum){
    /*  x = 0, y = i
        x = i, y = 0
        x = i--, y = 0
        x = 0, y = i--
        x = i + 1, y = i + 1
    */
    if(board[x][y] == players[0].playerColour){
        // check to right
        for(int i = y; i < y + 4; i++){
            if(board[x][i].squareColour == player)

        }

    }

}
