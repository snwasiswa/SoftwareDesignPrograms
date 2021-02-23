// Import the relevant JUnit classes
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * The class represents the behavior of.
 * @see        PostFixEval_HardJUnitTest
 * @author     Steve Wasiswa
 * @version    1.0  November 13,2020
 */
public class PostFixEval_HardJUnitTest {

    /**Instance variable of type PostfixEvaluator*/
    PostfixEvaluator evaluator = new PostfixEvaluator();


    /**
     * The method tests the addition
     */
    @Test
    void addition(){
        StringBuffer expression =  new StringBuffer("10 1 +");
        assertEquals(11,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the subtraction
     */
    @Test
    void subtraction(){
        StringBuffer expression =  new StringBuffer("10 1 -");
        assertEquals(9,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the multiplication
     */
    @Test
    void multiplication(){
        StringBuffer expression =  new StringBuffer("10 2 *");
        assertEquals(20,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the division
     */
    @Test
    void division(){
        StringBuffer expression =  new StringBuffer("30 2 /");
        assertEquals(15,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the division by zero
     */
    @Test
    void divisionByZero(){
        StringBuffer expression =  new StringBuffer("10 0 /");
        assertEquals(-1,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the power
     */
    @Test
    void power(){
        StringBuffer expression =  new StringBuffer("10 2 ^");
        assertEquals(100,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests the modulo
     */
    @Test
    void modulo(){
        StringBuffer expression =  new StringBuffer("10 5 %");
        assertEquals(0,evaluator.evaluatePostfixExpression(expression));
    }


    /**
     * The method tests an expression
     */
    @Test
    void expression(){
        StringBuffer expression =  new StringBuffer("10 5 + 2 * 3 / 4 % 3 ^ 4 -");
        assertEquals(4,evaluator.evaluatePostfixExpression(expression));
    }

    /**
     * The method tests a bad expression
     */
    @Test
    void badExpression(){
        StringBuffer expression =  new StringBuffer("10 5 %%");
        assertEquals(-1,evaluator.evaluatePostfixExpression(expression));
    }
}
/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */