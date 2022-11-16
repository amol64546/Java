package CircularLL;

class Node{
    int val;
    Node next;    
    Node(int val){
        this.val = val;
    }
}

class CircularLL{
    Node tail;
    void insert(int val){
        Node n = new Node(val);
        if(tail==null){
            tail = n;
            tail.next = tail;
        }else{
            n.next = tail.next;
            tail.next = n;
            tail = n;
        }
    }
    void print(){
        Node temp = tail.next;
        do{
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        while(temp != tail.next);           
        
       
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.print();
    }
}
