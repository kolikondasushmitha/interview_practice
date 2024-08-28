
class Node{
    int data;
    Node previous;
    Node next;   //instance variables

}

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;


    public void addFirst(int data){
        Node newnode = new Node();
        newnode.data=data;

        if (head==null){
            head=newnode;
            tail=newnode;
        }else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }


    }




}
