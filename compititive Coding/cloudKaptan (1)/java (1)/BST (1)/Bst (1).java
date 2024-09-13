public class Bst {

    public static Node head;

    public static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = Insert(root.left, val);
        } else {
            root.right = Insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    // search
    public static boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return Search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return Search(root.right, key);
        }
    }

    // delete
    public static Node Delete(Node root, int val) {
        if (root.data > val) {
            root.right = Delete(root.right, val);
        } else if (root.data < val) {
            root.left = Delete(root.left, val);
        } else {
            // case 1(no child)
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 (onr child)
            if (root.left == null)
                return root.right;
            else if (root.right == null) {
                return root.left;
            }

            // case3
              Node Is=inoderSuccsor(root.right);
              root.data=Is.data;
        root.right= Delete(root.right,Is.data);
        }
        return root;
    }
public static Node inoderSuccsor(Node root){
while (root.left!=null) {
    root=root.left;
}
return root;
}
    public static void main(String[] args) {
        int arr[] = { 5, 1, 3, 4, 7, 6, 9 };
        Node root = null;

        for (int i = 0; i < arr.length; i++) {
            root = Insert(root, arr[i]);
        }
        Inorder(root);
        // search
        int key = 11;
        if (Search(root, key) == true) {
            System.out.println("found");
        } else {
            System.out.println("Not found");
        }

        Delete(root, 4);
    
        Inorder(root);
    }
}