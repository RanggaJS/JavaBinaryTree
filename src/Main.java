import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insertHelper(this.root, val);
    }

    private TreeNode insertHelper(TreeNode node, int val) {
        if (node == null) {
            return new TreeNode(val);
        }
        if (val < node.val) {
            node.left = insertHelper(node.left, val);
        } else {
            node.right = insertHelper(node.right, val);
        }
        return node;
    }

    public void inOrderTraversal() {
        inOrderTraversalHelper(this.root);
        System.out.println();
    }

    private void inOrderTraversalHelper(TreeNode node) {
        if (node != null) {
            inOrderTraversalHelper(node.left);
            System.out.print(node.val + " ");
            inOrderTraversalHelper(node.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalHelper(this.root);
        System.out.println();
    }

    private void preOrderTraversalHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrderTraversalHelper(node.left);
            preOrderTraversalHelper(node.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalHelper(this.root);
        System.out.println();
    }

    private void postOrderTraversalHelper(TreeNode node) {
        if (node != null) {
            postOrderTraversalHelper(node.left);
            postOrderTraversalHelper(node.right);
            System.out.print(node.val + " ");
        }
    }

    public void levelOrderTraversal() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                assert node != null;
                System.out.print(node.val + " ");

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }

            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        BinaryTree tree1 = new BinaryTree();
        tree1.insert(26);
        tree1.insert(20);
        tree1.insert(48);
        tree1.insert(30);
        System.out.print("InOrder traversal 1: ");
        tree1.inOrderTraversal();
        System.out.print("PreOrder traversal 1: ");
        tree1.preOrderTraversal();
        System.out.print("PostOrder traversal 1: ");
        tree1.postOrderTraversal();
        System.out.println();

        BinaryTree tree2 = new BinaryTree();
        tree2.insert(10);
        tree2.insert(5);
        tree2.insert(2);
        tree2.insert(8);
        tree2.insert(9);
        tree2.insert(14);
        tree2.insert(38);
        System.out.print("InOrder traversal 2: ");
        tree2.inOrderTraversal();
        System.out.print("PreOrder traversal 2: ");
        tree2.preOrderTraversal();
        System.out.print("PostOrder traversal 2: ");
        tree2.postOrderTraversal();
        System.out.println();

        BinaryTree tree3 = new BinaryTree();
        tree3.insert(47);
        tree3.insert(5);
        tree3.insert(3);
        tree3.insert(20);
        tree3.insert(74);
        tree3.insert(60);
        tree3.insert(50);
        tree3.insert(78);
        System.out.print("InOrder traversal 3: ");
        tree3.inOrderTraversal();
        System.out.print("PreOrder traversal 3: ");
        tree3.preOrderTraversal();
        System.out.print("PostOrder traversal 3: ");
        tree3.postOrderTraversal();
        System.out.println();

        BinaryTree tree4 = new BinaryTree();
        tree4.insert(41);
        tree4.insert(20);
        tree4.insert(11);
        tree4.insert(29);
        tree4.insert(32);
        tree4.insert(65);
        tree4.insert(50);
        tree4.insert(91);
        tree4.insert(72);
        System.out.print("InOrder traversal 4: ");
        tree4.inOrderTraversal();
        System.out.print("PreOrder traversal 4: ");
        tree4.preOrderTraversal();
        System.out.print("PostOrder traversal 4: ");
        tree4.postOrderTraversal();
        System.out.println();

        BinaryTree tree5 = new BinaryTree();
        tree5.insert(10);
        tree5.insert(5);
        tree5.insert(15);
        tree5.insert(3);
        tree5.insert(7);
        tree5.insert(20);
        tree5.insert(2);
        tree5.insert(8);
        tree5.insert(18);
        tree5.insert(25);
        tree5.insert(1);
        tree5.insert(22);
        tree5.insert(30);
        tree5.insert(4);

        System.out.print("InOrder traversal TreeBuatan: ");
        tree5.inOrderTraversal();
        System.out.print("PreOrder traversal TreeBuatan: ");
        tree5.preOrderTraversal();
        System.out.print("PostOrder traversal TreeBuatan: ");
        tree5.postOrderTraversal();
        System.out.println();
        System.out.println("================================================================\n");

        System.out.println("LevelOrder traversal 1: ");
        tree1.levelOrderTraversal();
        System.out.println();

        System.out.println("LevelOrder traversal 2: ");
        tree2.levelOrderTraversal();
        System.out.println();

        System.out.println("LevelOrder traversal 3: ");
        tree3.levelOrderTraversal();
        System.out.println();

        System.out.println("LevelOrder traversal 4: ");
        tree4.levelOrderTraversal();
        System.out.println();

        System.out.println("LevelOrder traversal TreeBuatan: ");
        tree5.levelOrderTraversal();
        System.out.println();
    }
}

