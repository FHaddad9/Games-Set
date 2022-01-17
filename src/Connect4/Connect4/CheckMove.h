
#include <stdbool.h>
#include "InitialiseBoard.h"

#ifndef CONNECT4_CHECKMOVE_H
#define CONNECT4_CHECKMOVE_H

void checkValidSquare(square board[BOARD_X][BOARD_Y], player players[PLAYERS_NUM], int x, int y, int playerNum);

#endif //CONNECT4_CHECKMOVE_H
