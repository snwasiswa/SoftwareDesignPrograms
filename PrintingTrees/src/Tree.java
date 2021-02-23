/**
 * The class represents the behavior of.
 * @see        Tree
 * @author     Steve Wasiswa
 * @version    1.0  November 20,2020
 */
public class  Tree<T extends Comparable<T>> {

    /**Instance variable of Type TreeNode for the root node*/
    private TreeNode<T> root;

    /**
     * Class constructor that initializes the instance variable.
     */
    public Tree() {
        root = null;
    }

    /**
     * The method inserts a new node in the binary search treee
     * @param      insertValue the value or data to insert in the Tree
     */
    public void insertNode(T insertValue) {
        if (root == null)
            root = new TreeNode<T>(insertValue); // create root node
        else
            root.insert(insertValue); // call the insert method
    }

    /**
     * The method begins preorder traversal on a tree
     */
    public void preorderTraversal() {
        preorderHelper(root);
    }

    /**
     * The method performs preorder traversal recursively
     * @param      node    Reference to the current node that helps in traversing a tree
     */
    private void preorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        System.out.printf("%s ", node.data); // output node data
        preorderHelper(node.leftNode); // traverse left subtree
        preorderHelper(node.rightNode); // traverse right subtree
    }

    /**
     * The method begins ineorder traversal on a tree
     */
    public void inorderTraversal() {
        inorderHelper(root);
    }

    /**
     * The method performs inorder traversal recursively
     * @param      node    Reference to the current node that helps in traversing a tree
     */
    private void inorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        inorderHelper(node.leftNode); // traverse left subtree
        System.out.printf("%s ", node.data); // output node data
        inorderHelper(node.rightNode); // traverse right subtree
    }

    /**
     * The method begins postorder traversal on a tree
     */
    public void postorderTraversal() {
        postorderHelper(root);
    }

    /**
     * The method performs postorder traversal recursively
     * @param      node    Reference to the current node that helps in traversing a tree
     */
    private void postorderHelper(TreeNode<T> node) {
        if (node == null)
            return;

        postorderHelper(node.leftNode); // traverse left subtree
        postorderHelper(node.rightNode); // traverse right subtree
        System.out.printf("%s ", node.data); // output node data
    }

    /**
     * The method begins the process of outputting a tree
     */
    public void outputTree()
    {
        outputTreeHelper(root, 0);
    }

    /**
     * The method outputs a tree in a nice format starting with the root node on the left
     * @param       currentNode    The reference to the current node
     * @param       totalSpaces    Number of spaces preceding the value to be output
     */
    private void outputTreeHelper(TreeNode<T> currentNode, int totalSpaces) {
        // Performs the next operations while the current node is not null
        while (currentNode != null) {
            // Recursively outputs the subtree
            outputTreeHelper(currentNode.rightNode, totalSpaces + 5);

            for (int i = 1; i <= totalSpaces; i++) {
                System.out.print(" ");
            }
            System.out.println(currentNode.data.toString()); // Get data of the current node
            currentNode = currentNode.leftNode;  // Set the current node to the left subtree of the current node
            totalSpaces += 5;   // Increment the total spaces
        }
    }
} // end class Tree
/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */
