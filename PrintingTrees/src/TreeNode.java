/**
 * The class represents the behavior of.
 * @see         TreeNode
 * @author      Steve Wasiswa
 * @version     1.0 November 20,2020
 */
class TreeNode<T extends Comparable<T>> {

    /**Instance variable of Type TreeNode for the left node*/
    TreeNode<T> leftNode;
    /**Instance variable of Type T to store data */
    T data;
    /**Instance variable of Type TreeNode for the right node */
    TreeNode<T> rightNode;

    /**
     * Class constructor that initializes the instance variables.
     * @param       nodeData    Data for the tree
     */
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }

    /**
     * The method locates insertion point and insert new node; ignore duplicate values
     * @param      insertValue the value or data to insert in the Tree
     */
    public void insert(T insertValue) {
        // insert in left subtree
        if (insertValue.compareTo(data) < 0) {
            // insert new TreeNode
            if (leftNode == null)
                leftNode = new TreeNode<T>(insertValue);
            else // continue traversing left subtree recursively
                leftNode.insert(insertValue);
        }
        // insert in right subtree
        else if (insertValue.compareTo(data) > 0) {
            // insert new TreeNode
            if (rightNode == null)
                rightNode = new TreeNode<T>(insertValue);
            else // continue traversing right subtree recursively
                rightNode.insert(insertValue);
        }
    }
} // end class TreeNode
/**
 * (C) Copyright 2020 by Steve Wasiswa. All Rights Reserved.
 *
 */