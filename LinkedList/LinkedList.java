package SinglyLL;

public class LinkedList {
    Node head, tail;
    int size=0;
    void addFirst(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;    
        size++;    
    }

    void add(int pos, int val){
        Node n = new Node(val);
        if(pos == 0){
            head = n;
            tail = n;
            return;
        }
        tail.next = n;
        tail = n;
        size++;  
        
    }
    void addLast(int val){
        Node n = new Node(val);
        if(head==null){
            head = n; 
            tail = n; 
            return;          
        }      
            
        tail.next = n;
        tail = n;
        size++;          
    }  
    
}
