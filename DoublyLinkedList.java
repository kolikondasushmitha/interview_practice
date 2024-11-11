
class Node{
    int data;
    Node previous;
    Node next;   //instance variables

}

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size;

    public int size(){
        return size;
    }

    
    public boolean  isempty(){
        return (size==0);
    }

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
        size++;
    }

    public void addLast(int data){
        Node newNode= new Node();
        newNode.data=data;

        if(tail==null){
            
            head=newNode;
            tail=newNode;
            
        }
        else{
    
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            

        }
        size++;
    }
    
    public void displayForward(){
        Node temp=head;
        if(head==null){
            System.out.println("empty list");
        }else{

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }}


    public void displayBackward(){
        Node temp=tail;
        if (head==null){
            System.out.println("Empty");

        }else{
            while(temp!=null){
                System.out.print(temp.data);
            }
            temp=temp.previous;
        }

    }

    


    }
    public static void main(String[] args) {
        
    }




}
