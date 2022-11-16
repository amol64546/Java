package DoublyLL;

class Node{
    int val;
    Node next;
    Node prev;    
    Node(int val){
        this.val = val;
    }
}

class DoublyLL{
    Node head, tail;
    void insert(int val){
        Node n = new Node(val);
        if(head==null){
            head = n;
            tail = n;           
        }else{
           tail.next = n;
           n.prev = tail;
           tail = n;
        }
    }
    void print(){
        Node temp = head;        
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }        
        
        System.out.println();
    }
    void reversePrint(){
        Node temp = tail;        
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }        
        
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.reversePrint();
    }
}
