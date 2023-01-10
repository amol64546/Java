

class Node{
    int val;
    Node next;
    Node prev;
    public int data;    
    Node(int val){
        this.val = val;
    }
    public Node() {
    }
}

class MyDLL{
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

public class DoublyLL {
    public static void main(String[] args) {
        MyDLL list = new MyDLL();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.reversePrint();
    }
}
