package Semester_2.Pemrograman_2.Week_14;

// Simple binary tree class that includes methods to construct a

// tree of ints, to print the structure, and to print the data
// using a preorder, inorder or postorder traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."

public class IntTree {
    private IntTreeNode overallRoot;

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    // nodes
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless
    // n is greater than max, in which case it returns an
    // empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max),
                    buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints the tree contents using a preorder traversal
    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    // inorder traversal and using indentation to indicate
    // node depth; prints right to left so that it looks
    // correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    // root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }

    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int count = countLeftNodes(root.left);
            if (root.left != null) {
                count++;
            }
            count += countLeftNodes(root.right);
            return count;
        }
    }

    public void printLeaves() {
        System.out.print("leaves:");
        printLeaves(overallRoot);
        System.out.println();
    }

    private void printLeaves(IntTreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.print(" " + root.data);
            }
            printLeaves(root.right);
            printLeaves(root.left);
        }
    }

    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int depthSum(IntTreeNode root, int depth) {
        if (root == null) {
            return 0;
        } else {
            int sum = depth * root.data;
            sum += depthSum(root.left, depth + 1);
            sum += depthSum(root.right, depth + 1);
            return sum;
        }
    }

    public void removeLeaves() {
        overallRoot = removeLeaves(overallRoot);
    }

    private IntTreeNode removeLeaves(IntTreeNode root) {
        if (root == null) {
            return null;
        } else if (root.left == null && root.right == null) {
            return null;
        } else {
            root.left = removeLeaves(root.left);
            root.right = removeLeaves(root.right);
            return root;
        }
    }

    public void completeToLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level must be greater than or equal to 1");
        }
        overallRoot = completeToLevel(overallRoot, level, 1);
    }

    private IntTreeNode completeToLevel(IntTreeNode root, int targetLevel, int currentLevel) {
        if (currentLevel > targetLevel) {
            return root;
        }
        if (root == null) {
            root = new IntTreeNode(-1);
        }
        root.left = completeToLevel(root.left, targetLevel, currentLevel + 1);
        root.right = completeToLevel(root.right, targetLevel, currentLevel + 1);
        return root;
    }

    public void trim(int min, int max) {
        overallRoot = trim(overallRoot, min, max);
    }

    private IntTreeNode trim(IntTreeNode root, int min, int max) {
        if (root == null) {
            return null;
        }

        if (root.data < min) {
            return trim(root.right, min, max);
        } else if (root.data > max) {
            return trim(root.left, min, max);
        } else {
            root.left = trim(root.left, min, max);
            root.right = trim(root.right, min, max);
            return root;
        }
    }
}
