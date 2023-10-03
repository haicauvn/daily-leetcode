package haicauvn.dailyleetcode.tree;


/**
 * Definition for a binary tree node.
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class _701_InsertIntoABinarySearchTree {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        TreeNode temp = root;
        while (true) {
            if (val > temp.val) {
                if (temp.right == null) {
                    temp.right = new TreeNode(val);
                    return root;
                } else {
                    temp = temp.right;
                }

            } else {
                if (temp.left == null) {
                    temp.left = new TreeNode(val);
                    return root;
                } else {
                    temp = temp.left;
                }
            }
        }
    }

    public static TreeNode insertIntoBSTRecursion(TreeNode root, int val) {
        if (root == null) {
            TreeNode newNode = new TreeNode(val);
            root = newNode;
        } else {
            if (val < root.val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                } else {
                    insertIntoBST(root.left, val);
                }
            } else {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                } else {
                    insertIntoBST(root.right, val);
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        TreeNode p1 = root.left;
        TreeNode p6 = root.right;
        p1.left = new TreeNode(0);
        p1.right = new TreeNode(3);
        TreeNode p3 = p1.right;
        p3.left = new TreeNode(2);
        p6.right = new TreeNode(7);

        insertIntoBSTRecursion(root, 9);
        System.out.println(root);
    }
}
