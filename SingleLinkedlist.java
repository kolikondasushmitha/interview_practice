class Node{
    int data;
    Node next;
}

public class SingleLinkedlist {
    Node head;

    public void addFirst(int data){
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = head;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node();
        newnode.data = data;

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void removeFirst(){
        if (head != null) {
            head = head.next;
        }
    }

    public void removeLast(){
        if (head != null) {
            if (head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) { // Find the second last node
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
    }

    public void position(int data, int pos){
        Node newnode = new Node();
        newnode.data = data;
        Node temp = head;

        if (pos == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }

        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.err.println("Position out of bounds");
            return;
        }

        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; // Move to the next node
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleLinkedlist obj = new SingleLinkedlist();
        obj.addLast(1);
        obj.addFirst(2);
        obj.addFirst(3);

        obj.addLast(100);
        obj.removeFirst();

        obj.position(200, 1);

        obj.print(); // This will print the linked list
    }
}

    
