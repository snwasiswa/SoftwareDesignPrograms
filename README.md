# Java_programs


### Problem Statement

General purpose of this program is to have three inputs and one output using GUI.

input: number, current base, desired base
output: converted number

Convert between any two bases up to base 32

### Developer Documentation

The program has a class called "BaseChange" which extends JFrame. It has some private instances variables and one constructor which handles all the initializations and certain behaviors of the Frame. It also has one private class "TextFieldHandler". The private class implements ActionListener, they handle events once the are triggered. It converts any number from any base(2,10,16,32) to any desired base(2,10,16,32).To convert any number from a current base to any base, the program has the class"BaseChange", which has methods "decimalToAnyBase, binaryToAnyBase, octalToAnyBase, hexadecimalToAnyBase and baseThirtyTwoToAnyBase" to facilitate the conversion. Each one of them takes different arguments(integer, String, long), but returns a String literal. string literal. Finally, the program use the class called "BaseChangeDriver", which contains the main method to run the program.

[Javadocs](https://github.com/snwasiswa/Base-change/tree/master/doc)

### User Documentation

In order to use the program, the user needs to run the class called "BaseChangeDriver". After the execution, the user needs to enter a number, current base and desired base into the GUI app; then, hit enter to get the result. 

### Source Code

[Click here for source code](https://github.com/snwasiswa/Base-change/tree/master/src)
