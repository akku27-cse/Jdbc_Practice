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

    public static void InsertAtFrst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // InsertAtLAst
    public static void InsertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;

        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    // AddSpecific
    public static void InsertAtSpecific(int data) {
        Node newNode = new Node(data);
        int pos = 3;
        if (head == null) {
            head = newNode;
            return;

        }

        Node currNode = head;
        Node tempNode = head;

        for (int i = 1; i < 3 - 1; i++) {
            currNode = currNode.next;

        }
        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    // remove First
    public static void RemoveFirst() {
        if (head == null) {
            System.out.println("No Node Present");
            return;
        }
        head = head.next;
    }

    // remove last
    public static void RemoveLast() {
        if (head == null) {
            System.out.println("No Node Present");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head.next;
        Node tempNode = head;
        while (currNode.next != null) {
            tempNode = tempNode.next;
            currNode = currNode.next;

        }
        tempNode.next = null;
    }

    // delete At Position
    // remove last
    public static void RemovePos() {
        if (head == null) {
            System.out.println("No Node Present");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head.next;
        Node tempNode = head;
        int pos = 3;
        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;
            tempNode = tempNode.next;

        }
        tempNode.next = currNode.next;
    }


    //reversee Linklist
    public static void ReverseLisk(){
        if (head == null) {
            System.out.println("No Node Present");
            return;
        } 
        Node currNode = head.next;
        Node tempNode = head;
        while(currNode!=null){

             Node nextNode=currNode.next;

             currNode.next=tempNode;
             tempNode=currNode;
             currNode=nextNode;
        }
        head.next=null;
        head=currNode;
    }
    // print
    static void Print() {
        if (head == null) {
            System.out.println("Empty Linked List");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;

        }
        System.out.print("null");

    }

    public static void main(String[] args) {

        LinkList list = new LinkList();
        list.InsertAtFrst(9);
        list.InsertAtFrst(8);
        list.InsertAtLast(6);
        list.InsertAtLast(12);
        list.InsertAtSpecific(7);
        list.InsertAtFrst(10);
        list.InsertAtFrst(14);
        list.InsertAtLast(15);
        list.RemoveFirst();
        list.RemoveLast();
        list.RemovePos();
        
        list.Print();
      //  list.ReverseLisk();
    }
}