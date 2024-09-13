/**
 * LinkList
 */
public class LinkList {

    public static Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void insertAtBeg(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // insert at specific
    public static void insertAtpos(int pos, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        if (head.next == null) {
            newNode.next = head;
            head = newNode;
        }
        Node currNode = head;
        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public static void Sort() {
        int size = 10;
        int arr[] = new int[size];
        Node currNode = head;
        int i = 0;
        while (currNode != null) {
            arr[i] = currNode.data;
            i++;
            currNode = currNode.next;
        }
        for (int k = 1; k < arr.length; k++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        Node t = head;
        for (int m = 0; m < arr.length; m++) {
            t.data = arr[m];
            System.out.print(t.data + "->");
        }
        System.out.print("null");

    }

    //find Middle
    public static void FindMiddle(){
        Node currNode=head;
        int count=0;
        while (currNode!=null) {
            count+=1;
            currNode=currNode.next;
        }
        int mid=0+(count-0)/2;
        System.out.println("middle ="+mid);
    }
    // print
    public static void Display() {
        if (head == null) {
            System.out.println("No Node  present");
            return;
        }
        Node currNode2 = head;
        while (currNode2 != null) {
            System.out.print(currNode2.data + "->");
            currNode2 = currNode2.next;

        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        LinkList list1 = new LinkList();
        list1.insertAtBeg(7);
        list1.insertAtBeg(10);
        list1.insertAtBeg(11);
        list1.insertAtpos(2, 9);
        list1.insertAtBeg(6);
        list1.insertAtBeg(5);
        // list1.Display();
        //list1.Sort();
        list1.FindMiddle();
        list1.Display();

    }
}