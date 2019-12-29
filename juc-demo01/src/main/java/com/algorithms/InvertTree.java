package com.algorithms;

public class InvertTree {
    public static void main(String[] args) {

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

}

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value){
        this.value = value;
    }
}
