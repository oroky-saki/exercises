package printTree;

public class Main {


    public static void main(String[] args) {

        Node root = new Node(5);
        root.addNode(new Node(3));
        root.addNode(new Node(7));
        root.addNode(new Node(2));
        root.addNode(new Node(4));
        root.addNode(new Node(6));
        root.addNode(new Node(8));

        root.printTree();
    }
}
