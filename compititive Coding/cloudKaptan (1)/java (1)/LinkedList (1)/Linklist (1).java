import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Scanner;

public class Linklist {

    public static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void InsertATBeg(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

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

    public static void InsertAtSpec(int data, int pos) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < pos - 1; i++) {
            currNode = currNode.next;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // print
    public static void Display() {
        if (head == null) {
            System.out.println("No List is Presnet");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // delete at First
    public static void deleteAtFirst() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        head = head.next;
    }

    // deleteatLast
    public static void deleteatLast() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        Node currNode = head.next;
        Node tempNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            tempNode = tempNode.next;
        }
        tempNode.next = null;
    }

    // delete AT Specific
    public static void deleteAtSpecific(int pos) {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        Node curNode = head.next;
        Node temNode = head;
        for (int i = 1; i < pos - 1; i++) {
            curNode = curNode.next;
            temNode = temNode.next;
        }

        temNode.next = curNode.next;
    }

    // reverse
    public static void Reverse() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode.next != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;

        }

        head = null;
        currNode = head;

    }

    public static Node findLoop() {
        if (head == null) {
            System.out.println("No Node Is present");
            return null;
        }
        Node fast = head;
        Node slow = head;
        while (fast != slow || fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                System.out.println("Loop Found");
            }

        }
        System.out.println("Not Found");
        return slow;
    }

    // remove Loop
    public static void removeLoop() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        Node fast = findLoop();
        Node slow = head;

        while (slow.next != fast.next) {
            fast = fast.next;
            slow = slow.next;
            if (fast.next != slow.next) {
                fast.next = null;
            }
        }
    }

    public static void addTwoNumber() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        if (head.next == null) {
            System.out.println("One Node is present");
        }
        Node currNode = head;
        int sum = 0;
        for (int i = 1; i <= 2; i++) {
            sum += currNode.data;
            currNode = currNode.next;

        }
        System.out.println("Addition of Two Node is=" + sum);
    }

    public static void findMiddle() {
        if (head == null) {
            System.out.println("No Node Is present");
            return;
        }
        Node currNode = head;

        int count = 1;

        while (currNode.next != null) {
            count++;
           
        Node tNode=head;
        int mid=count/2;
        for(int i=1;i<=mid;i++){
            tNode=tNode.next;
        if(i==mid){
            System.out.println(tNode.data);
        }
    }
}

    }
    public static Node RotatteList(){
        /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            
        }
        ListNode temp2=head;
        temp.next=head;
        ListNode prev=null;
        int n=0;
        while(n<k){
            
            prev=temp2;
            temp2=temp2.next;
            n++;
        }
        prev.next=null;
        return temp2;
    }
}
    }

    public static void main(String[] args) {
        Linklist ls = new Linklist();
        ls.InsertATBeg(9);
        ls.InsertATBeg(7);
        ls.InsertAtLast(11);
        ls.InsertAtLast(15);
        ls.InsertAtSpec(14, 3);
        ls.InsertATBeg(9);
        ls.InsertATBeg(7);
        // ls.deleteAtFirst();
        // ls.deleteatLast();
        // ls.deleteAtSpecific(2);
        // ls.findLoop();
        ls.addTwoNumber();
        ls.findMiddle();
        ls.Display();

        // Scanner sc=new Scanner(System.in);
        // int choice=0, data;
        // //choice=sc.nextInt();
        // while(choice!=9) {
        // System.out.println("1.Insert At Fist" + "2.Insert At Last" +
        // "3. Insert At Pos" +
        // "4.delete at beg"
        // + "5.Delete at last" +
        // "6.Delete At pos"+
        // "7.Exit");

        // switch (choice) {
        // case 1:
        // System.out.println("Insert the data");
        // data=sc.nextInt();
        // ls.InsertATBeg(data);
        // break;
        // case 2:
        // System.out.println("Insert the data");
        // data=sc.nextInt();
        // ls.InsertAtLast(data);
        // break;
        // case 3:
        // ls.Display();
        // break;
        // // case 4:exit(0);
        // // break;
        // default:System.out.println("no data");
        // }

        // }
    }
}