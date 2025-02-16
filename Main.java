/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

/**
 *
 * @author Dulnith
 */

// Node data structure for Binary Search Tree
class BSTNode {
    private BSTNode leftNode; // Left child of the node
    private BSTNode rightNode; // Right child of the node
    private int data; // Data held by the node

    // Constructor for BSTNode class
    public BSTNode(int value) {
        this.data = value; // Initialize the node's data
        this.leftNode = null; // Left child is initially null
        this.rightNode = null; // Right child is initially null
    }

    // Getter for data
    public int getData() {
        return data;
    }

    // Getter for left node
    public BSTNode getLeftNode() {
        return leftNode;
    }

    // Setter for left node
    public void setLeftNode(BSTNode leftNode) {
        this.leftNode = leftNode;
    }

    // Getter for right node
    public BSTNode getRightNode() {
        return rightNode;
    }

    // Setter for right node
    public void setRightNode(BSTNode rightNode) {
        this.rightNode = rightNode;
    }
}

// Binary Search Tree (BST) Class
class BST {
    // Method to insert a new value into the BST
    public void insert(BSTNode root, int value) {
        // Base case: If the current node is null, create a new node
        if (root == null) {
            root = new BSTNode(value);
        } else {
            // If value is smaller than current node's data, insert it in the left subtree
            if (value < root.getData()) {
                // If left child is null, create a new left child node
                if (root.getLeftNode() == null) {
                    root.setLeftNode(new BSTNode(value));
                } else {
                    // Recursively call insert method on the left subtree
                    insert(root.getLeftNode(), value);
                }
            } else {
                // If value is greater than current node's data, insert it in the right subtree
                if (root.getRightNode() == null) {
                    root.setRightNode(new BSTNode(value));
                } else {
                    // Recursively call insert method on the right subtree
                    insert(root.getRightNode(), value);
                }
            }
        }
    }

    // Recursive method to find a value in the BST
    public boolean findValueRecursively(BSTNode node, int value) {
        // Base case: if node is null, the value is not found in the tree
        if (node == null) {
            return false;
        }

        // If the current node's data matches the value, return true
        if (value == node.getData()) {
            return true;
        } else if (value < node.getData()) {
            // If the value is smaller, search in the left subtree
            return findValueRecursively(node.getLeftNode(), value);
        } else {
            // If the value is greater, search in the right subtree
            return findValueRecursively(node.getRightNode(), value);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of the BST class
        BST bst = new BST();

        // Initialize the root node with value 4
        BSTNode bstNode = new BSTNode(4);

        // Insert values into the BST
        bst.insert(bstNode, 2); // Insert value 2
        bst.insert(bstNode, 5); // Insert value 5
        bst.insert(bstNode, 6); // Insert value 6
        bst.insert(bstNode, 1); // Insert value 1
        bst.insert(bstNode, 3); // Insert value 3
        bst.insert(bstNode, 7); // Insert value 7

        // Searching for a value (7) in the BST
        if (bst.findValueRecursively(bstNode, 7)) {
            System.out.println("Element is found!"); // If the value is found
        } else {
            System.out.println("Element is not found!"); // If the value is not found
        }
    }
}

