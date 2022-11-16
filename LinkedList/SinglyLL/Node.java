package SinglyLL;


public class Node{
    int val;
    Node next;
    public Node(){
               
    }
    public Node(int val){
        this.val = val;  
        next = null;     
    }
    public Node(int val, Node next){
        this.val = val;  
        this.next = next;     
    }
}
