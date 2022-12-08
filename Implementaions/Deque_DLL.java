

class Node{
     int data;
     Node next;
     Node prev;
    Node(int data){
        this.data=data;
    }
}

class MyDeque{
     Node head, tail;
     int size;
    
    public void addFirst(int data){
        size++;
        Node node = new Node(data);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    
    public void addLast(int data){
        size++;
        Node node = new Node(data);
        if(head==null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    
    public void removeFirst(){        
        if(head==null){
            System.out.println("\n Underflow");
            return;
        }
        size--;         
        if(size==0){
            head = null;
            tail = null;
            return;
        }
        head.next.prev = null;
        head = head.next;        
        
    }
    
    public void removeLast(){
       if(head==null){
            System.out.println("\n Underflow");
            return;
        }
        size--;         
        if(size==0){
            head = null;
            tail = null;
            return;
        }
        tail.prev.next = null;
        tail = tail.prev;
    }
}

public class Deque_DLL {
     public static void main(String[] args)
    {
       MyDeque dq = new MyDeque();
         dq.addFirst(5);
        dq.addFirst(6);
         dq.addLast(4);
         dq.addLast(3);
         dq.removeFirst();
         dq.removeLast();
         dq.removeLast();
       

         Node head = dq.head;
         while(head!=null){
             System.out.print(head.data+" ");
             head = head.next;
         }
    }
}

