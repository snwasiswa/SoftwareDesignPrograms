import java.util.*;
/**
 * The class represents the behavior of.
 * @see        PostfixEvaluatorDriver
 * @author     Steve Wasiswa
 * @version    1.0  November 13,2020
 */
public class PostfixEvaluatorDriver {
    /**
     * Allows the user to test or evaluate an expression by requesting an input
     * @param  args     array of string
     */
    public static void main(String[] args) { // main method begins execution of Java application

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an expression to evaluate, separate each digit and operator with space: ");
        // Create StringBuffer object
        StringBuffer expression =  new StringBuffer(input.nextLine());
        // Create PostfixEvaluator object
        PostfixEvaluator evaluator = new PostfixEvaluator();
        System.out.println("Result: " + evaluator.evaluatePostfixExpression(expression));
    } // end method main
}

/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */