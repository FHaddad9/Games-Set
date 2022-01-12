cmake_minimum_required(VERSION 3.17)
project(Connect4 C)

set(CMAKE_C_STANDARD 99)

add_executable(Connect4 main.c InitialiseBoard.c)