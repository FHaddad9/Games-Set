# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /cygdrive/c/Users/35383/AppData/Local/JetBrains/CLion2020.3/cygwin_cmake/bin/cmake.exe

# The command to remove a file.
RM = /cygdrive/c/Users/35383/AppData/Local/JetBrains/CLion2020.3/cygwin_cmake/bin/cmake.exe -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug

# Include any dependencies generated for this target.
include CMakeFiles/Connect4.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Connect4.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Connect4.dir/flags.make

CMakeFiles/Connect4.dir/main.c.o: CMakeFiles/Connect4.dir/flags.make
CMakeFiles/Connect4.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Connect4.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Connect4.dir/main.c.o   -c /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/main.c

CMakeFiles/Connect4.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Connect4.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/main.c > CMakeFiles/Connect4.dir/main.c.i

CMakeFiles/Connect4.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Connect4.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/main.c -o CMakeFiles/Connect4.dir/main.c.s

CMakeFiles/Connect4.dir/InitialiseBoard.c.o: CMakeFiles/Connect4.dir/flags.make
CMakeFiles/Connect4.dir/InitialiseBoard.c.o: ../InitialiseBoard.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir=/cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_2) "Building C object CMakeFiles/Connect4.dir/InitialiseBoard.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Connect4.dir/InitialiseBoard.c.o   -c /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/InitialiseBoard.c

CMakeFiles/Connect4.dir/InitialiseBoard.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Connect4.dir/InitialiseBoard.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/InitialiseBoard.c > CMakeFiles/Connect4.dir/InitialiseBoard.c.i

CMakeFiles/Connect4.dir/InitialiseBoard.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Connect4.dir/InitialiseBoard.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/InitialiseBoard.c -o CMakeFiles/Connect4.dir/InitialiseBoard.c.s

# Object files for target Connect4
Connect4_OBJECTS = \
"CMakeFiles/Connect4.dir/main.c.o" \
"CMakeFiles/Connect4.dir/InitialiseBoard.c.o"

# External object files for target Connect4
Connect4_EXTERNAL_OBJECTS =

Connect4.exe: CMakeFiles/Connect4.dir/main.c.o
Connect4.exe: CMakeFiles/Connect4.dir/InitialiseBoard.c.o
Connect4.exe: CMakeFiles/Connect4.dir/build.make
Connect4.exe: CMakeFiles/Connect4.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug/CMakeFiles --progress-num=$(CMAKE_PROGRESS_3) "Linking C executable Connect4.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Connect4.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Connect4.dir/build: Connect4.exe

.PHONY : CMakeFiles/Connect4.dir/build

CMakeFiles/Connect4.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Connect4.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Connect4.dir/clean

CMakeFiles/Connect4.dir/depend:
	cd /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4 /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4 /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug /cygdrive/c/Users/35383/Documents/Games/Games-Set/src/Connect4/cmake-build-debug/CMakeFiles/Connect4.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/Connect4.dir/depend

