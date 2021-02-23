import java.util.*;
/**
 * The class represents the behavior of.
 * @see         PostfixEvaluator
 * @author      Steve Wasiswa
 * @version     1.0 November 13,2020
 */
public class PostfixEvaluator {

    /**Instance variable of Type Stack to store digits */
    Stack<Integer> digits;

    /**
     * Class constructor that initializes the instance variable.
     */
    public PostfixEvaluator(){
        digits = new Stack<>();
    }

    /**
     * The method evaluates the provided expression
     * @return     int, result of the expression after the evaluation
     * @param      buffer A StringBuffer object, an expression to evaluate
     */
    public int evaluatePostfixExpression(StringBuffer buffer){

        // Converse StringBuffer object into String Object and tokenize it
        String[] tokens =  (buffer.append(" ").toString() + ")").split(" ");

        // Create and initialize a String object
        String character="" ;

        int i =  0;
        // Go through all the tokens ansd check if the token is
        while (i < tokens.length){
            //Concatenate  the string object with a new token
            character = character + (tokens[i]);
            // while character doesn't reach )
            if (!character.equals(")")) {
                // check if it is digit
                if (isDigit(character) == true){
                    //Add the digit into the stack
                    digits.push(Integer.parseInt(character));
                   // Check if the character matches any of the operator, add the result found into the stack
                }else if (character.equals("*") || character.equals("+") || character.equals("-") || character.equals("/")
                        || character.equals("%") || character.equals("^")) {
                    // Add result into the stack after computation
                    digits.push(calculate(character));
                } else {
                    // Returns -1 for others cases such as mismatches in the stack, or wrong expression
                    return -1;
                }
            }
            // Set the string literal to null;
            character = "";
            i++;
        }
        // Returns the top element from the stack
        return (int)digits.pop();
    }
    /**
     * The method checks whether a string literal is a number or not
     * @return     boolean    true if the string literal is a number, otherwise false
     * @param      character   a String literal to evaluate
     */
    public boolean isDigit(String character){
        // Check if the string given is an integer
        try{
           Integer.parseInt(character);
        }catch(NumberFormatException e){
            return false;
        }
        return true;
   }

    /**
     * The method performs computations based on different operators
     * @return     int    result of the computation
     * @param      operator   a String literal to represent an operator("+","-",etc)
     */
    public int calculate(String operator) {

        int result = -1;
        try {
            int operand1 = (int) digits.pop();
            int operand2 = (int) digits.pop();

            // Perform computation based on operator
            if (operator.equals("+")){
                result = addition(operand1,operand2);
            }
             if(operator.equals("-")){
                result = subtraction(operand1,operand2);
            }if(operator.equals("*")){
                result = multiplication(operand1,operand2);
            }if(operator.equals("/")){
                result = division(operand1,operand2);
            }if(operator.equals("^")){
                result =  power(operand1,operand2);
            }if(operator.equals("%")){
                result = modulo(operand1,operand2);
            }
        } catch (EmptyStackException e) {
            e.printStackTrace();
        }
        // Returns the final result
        return result;
    }

    /**
     * The method adds two numbers
     * @return     int    primitive type, the sum of two numbers
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int addition(int operand1, int operand2){
        return operand1 + operand2;
    }

    /**
     * The method subtracts one number from another one
     * @return     int    primitive type, the difference of two numbers
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int subtraction(int operand1, int operand2){
        return operand2 - operand1;
    }

    /**
     * The method multiplies one number with another
     * @return     int    primitive type, the multiplication of two numbers
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int multiplication(int operand1, int operand2){
        return operand2 * operand1;
    }

    /**
     * The method divides one number by another one
     * @return     int    primitive type, the division of two numbers, and returns -1 if a number is divided by 0
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int division(int operand1, int operand2){
        int result = -1;
        try{
            result = operand2 / operand1;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * The method takes one number as a base and  another one as a power, returns their computation
     * @return     int    primitive type, the power function of two numbers
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int power(int operand1, int operand2){
        return (int)Math.pow(operand2,operand1);
    }

    /**
     * The method computes the remainder of two numbers
     * @return     int    primitive type, the remainder of two numbers
     * @param      operand1   an integer, first number from the stack
     * @param      operand2   an integer, second number from the stack
     */
    public int modulo(int operand1, int operand2){
        return operand2 % operand1;
    }
}
/**
 * (C) Copyright 2020 by Steve N. Wasiswa. All Rights Reserved.
 *
 */