package com.leetcode.editor.cn;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

/**
 * 二叉树中度数为2的次数
 */
public class BinaryTree {
    Node root;

    int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            if (root.left != null && root.right != null) {
                return size(root.left) + size(root.right) + 1;
            } else {
                return size(root.left) + size(root.right);
            }
        }
    }

    public static void main(String args[]) {
        // create binary tree
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("The size of binary tree is : " + tree.size(tree.root));

    }
}