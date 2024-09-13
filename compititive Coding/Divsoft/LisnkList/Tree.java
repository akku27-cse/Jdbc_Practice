import java.util.Scanner;

public class Tree {

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    static Node   createTree() {
        Scanner sc = new Scanner(System.in);
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if (root == -1) {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}
