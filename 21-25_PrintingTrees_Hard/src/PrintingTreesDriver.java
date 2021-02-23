import java.security.SecureRandom;
/**
 * The class represents the behavior of.
 * @see        PrintingTreesDriver
 * @author     Steve Wasiswa
 * @version    1.0  November 20,2020
 */
public class PrintingTreesDriver {
    /**
     * Testing different traversal methods as well as the outputTree method
     * @param args array of string
     */
    public static void main(String[] args) { // main method begins execution of Java application

        Tree<Integer> tree = new Tree<>();
        SecureRandom randomNumber = new SecureRandom();
        System.out.println("Inserting the following values: ");

        for ( int i = 1; i <= 10; i++)
        {
            int value = randomNumber.nextInt(100);
            System.out.printf("%d ", value);
            tree.insertNode(value);
        }

        System.out.printf("%n%nPreorder traversal:%n");
        tree.preorderTraversal();

        System.out.printf("%n%nInorder traversal:%n");
        tree.inorderTraversal();

        System.out.printf("%n%nPostorder traversal:%n");
        tree.postorderTraversal();

        System.out.println("\n\nOutput tree with random generated numbers:\n");
        tree.outputTree();
        System.out.println("\n");

        System.out.println("\nOutput tree with numbers from the exercise:\n");
        Tree<Integer> tree1 = new Tree<>();
        tree1.insertNode(49);
        tree1.insertNode(28);
        tree1.insertNode(83);
        tree1.insertNode(18);
        tree1.insertNode(40);
        tree1.insertNode(71);
        tree1.insertNode(97);
        tree1.insertNode(11);
        tree1.insertNode(19);
        tree1.insertNode(32);
        tree1.insertNode(44);
        tree1.insertNode(69);
        tree1.insertNode(72);
        tree1.insertNode(92);
        tree1.insertNode(99);
        tree1.outputTree();
    }
}
/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */