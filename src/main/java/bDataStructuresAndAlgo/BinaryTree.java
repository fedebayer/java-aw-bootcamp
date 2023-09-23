package bDataStructuresAndAlgo;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    // In-order traversal (left, root, right)
    public void inOrderTraversal(TreeNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.val + " ");
            inOrderTraversal(node.right);
        }
    }

    public void inOrder() {
        inOrderTraversal(root);
    }

    // Pre-order traversal (root, left, right)
    public void preOrderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    // Post-order traversal (left, right, root)
    public void postOrderTraversal(TreeNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " ");
        }
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal:");
        tree.inOrder();
        System.out.println("\nPre-order traversal:");
        tree.preOrder();
        System.out.println("\nPost-order traversal:");
        tree.postOrder();
    }
}
