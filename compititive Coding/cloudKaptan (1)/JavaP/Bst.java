public class Bst {

    static class Node {
        int value;
        Node right;
        Node left;

        Node(int value) {
            this.value = value;

            this.right = null;
            this.right = null;

        }
    }

    public static Node Insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.value > value) {
            root.left = Insert(root.left, value);
        } else {
            root.right = Insert(root.right, value);
        }
        return root;
    }

    // Inorder
    public static void Inorder(Node root) {
        if (root == null) {
            // System.out.println("Tree Does not exit");
            return;
        }
        Inorder(root.left);
        System.err.println(root.value);
        Inorder(root.right);

    }

    // search
    public static boolean Search(Node root) {
        int key = 13;
        if (root == null) {
            return false;
        }
        if (root.value > key) {
            return Search(root.left);
        } else if (root.value == key) {
            return true;
        } else {
            return Search(root.right);
        }

    }

    // remove Node
    public static Node RemeoveNode(Node root) {
        if (root == null) {
            return root;
        }
        int val = 9;
        if (root.value > val) {
            root.left = RemeoveNode(root.left);
        } else if (root.value < val) {
            root.right = RemeoveNode(root.right);
        } else {
            if (root.left == null && root.right == null) {
                return root;
            }
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // case 3
            Node Is = InorderSuccoser(root.right);
            root.value = Is.value;
            root.right = RemeoveNode(root.right);
        }
        return root;
    }

    public static Node InorderSuccoser(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int val[] = { 8, 5, 3, 6, 1, 2, 4, 9 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = Insert(root, val[i]);
        }
        RemeoveNode(root);
        Inorder(root);
        System.out.println();
        boolean bool = Search(root);
        // if (bool == true) {
        //     System.out.println("found");

        // } else {
        //     System.out.println("Not found");
        // }

    }
}
