package com.spart.sort;

public class BinaryTree {

        Node root;

        // Tree Node
        static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // Function to insert nodes in level order
        public Node insertLevelOrder(int[] ints, Node root,
                                     int i) {
            // Base case for recursion
            if (i < ints.length) {
                Node temp = new Node(ints[i]);
                root = temp;

                // insert left child
                root.left = insertLevelOrder(ints, root.left,
                        2 * i + 1);

                // insert right child
                root.right = insertLevelOrder(ints, root.right,
                        2 * i + 2);
            }
            return root;
        }

        // Function to print tree nodes in InOrder fashion
        public void inOrder(Node root) {
            if (root != null) {
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);
            }
        }
    }

