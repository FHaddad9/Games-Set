#ifndef CONNECT4_INITIALISEBOARD_H
#define CONNECT4_INITIALISEBOARD_H

#define BOARD_X 6
#define BOARD_Y 7
#define PLAYERS_NUM 2

//colours that a square can have
typedef enum colour {
    RED,
    YELLOW,
    NEUTRAL
}colour;

//player details
typedef struct player{
    colour playerColour;
    char name[20];
    int piecesOnBoard;
}player;

//types that a square can have
typedef enum squareType {
    VALID,
    INVALID
}squareType;

//square details whether it is valid/invalid and white/black
typedef struct square {
    squareType type;
    colour squareColour;
}square;

void initPlayers(player players[PLAYERS_NUM]);
void initBoard(square board[BOARD_X][BOARD_Y]);
void printBoard(square board[BOARD_X][BOARD_Y]);


#endif //CONNECT4_INITIALISEBOARD_H
