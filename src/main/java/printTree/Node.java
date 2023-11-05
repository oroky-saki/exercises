package printTree;

public class Node {

    public Node(int value) {
        this.value = value;
    }

    public int value;

    public Node left;

    public Node right;

    public int findMaxDepth() {
        if (this == null) {
            return 0;
        }
        int leftDepth = (left != null) ? left.findMaxDepth() : 0;
        int rightDepth = (right != null) ? right.findMaxDepth() : 0;
        return 1 + Math.max(leftDepth, rightDepth);
    }

    public void printTree() {
        int maxDepth = findMaxDepth();
        printNode(this, maxDepth, 0);
    }

    private void printNode(Node node, int depth, int currentLevel) {
        if (node == null || currentLevel > depth) {
            return;
        }

        if (currentLevel == depth) {
            printSpaces(currentLevel);
            System.out.println(node.value);
        } else {
            printNode(node.right, depth, currentLevel + 1);
            printSpaces(currentLevel);
            System.out.println(node.value);
            printNode(node.left, depth, currentLevel + 1);
        }
    }

    private void printSpaces(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("      ");
        }
    }

    public void addNode(Node node) {
        if (node.value >= this.value) {
            if (this.right == null)
                this.right = node;
            else
                this.right.addNode(node);
        } else {
            if (this.left == null)
                this.left = node;
            else
                this.left.addNode(node);
        }
    }

}
