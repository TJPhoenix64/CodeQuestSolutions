import java.util.Scanner;

public class Node {

    private int nodeValue;
    private Node parentNode;
    private Node grandParentNode;
    private Node uncleNode;
    private Node rightChildNode;
    private Node leftChildNode;

    public Node(int value) {
        parentNode = null;
        grandParentNode = null;
        uncleNode = null;
        rightChildNode = null;
        leftChildNode = null;
        nodeValue = value;
    }

    public Node(int value, Node parentNode) {
        this.parentNode = parentNode;
        if (value < parentNode.nodeValue) {
            parentNode.leftChildNode = new Node(value, parentNode);
        }
        if (value > parentNode.nodeValue) {
            parentNode.rightChildNode = new Node(value, parentNode);
        }
        this.grandParentNode = parentNode.parentNode;
        if (this.grandParentNode.nodeValue > value) {
            this.uncleNode = this.grandParentNode.rightChildNode;
        } else if (this.grandParentNode.nodeValue < value) {
            this.uncleNode = this.grandParentNode.leftChildNode;
        } else {
            System.err.println("There was an error with the relative nodes");
        }
    }

    @Override
    public String toString() {
        String answer = "";
        while (this.parentNode != null) {
            answer += nodeValue + "\n";
            this.parentNode = this;
        }
        return answer;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        String answer = "";
        for (int i = 0; i < numCases; i++) {
            int numInstructions = Integer.parseInt(sc.nextLine());
            Node prevNode = null;
            for (int j = 0; j < numInstructions; j++) {
                String[] input = sc.nextLine().split(" ");
                String instruction = input[0];
                int val = Integer.parseInt(input[1]);
                if (instruction.equals("ADD")) {
                    if (j == 0) {
                        Node hi = new Node(val);
                        prevNode = hi;
                        System.out.println(hi);

                    } else {
                        Node hi = new Node(val, prevNode);
                        System.out.println(hi);

                    }
                }

            }
            if (i + 1 != numCases) {
                answer += "\n";
            }
        }
        System.out.println(answer);
        sc.close();
    }
}