

public class SinglyLL {
    public static void main(String[] args) {
        MyLL list = new MyLL();
        list.add(5);
        list.add(9);
        list.add(0);
        // System.out.print(list.size);
        list.remove(1);        
        list.print();
        
    }  
  
}

class Node{
    int data;
    Node next;     
    Node(int data){
        this.data = data;        
    }
}

class MyLL{
    Node head, tail;  
     int size;

    void addFirst(int data){  
        Node node = new Node(data); 
        size++;
        if(tail==null){
            head = tail =node;
            return;
        }                 
        node.next = head;
        head = node;         
        
    } 
  
     void addLast(int data){   
         size++;
        if(head==null){
            head = new Node(data);
            tail=head;
            return;
        }
        tail.next = new Node(data);
        tail = tail.next;
         
    }
    
     
    void add(int data){
        addLast(data);       
    }
      
     void add(int index, int data){          
        if(index>size){  
            System.out.println("Index out of bound");
            return;
        }
                  
        if(index==0){
           addFirst(data);
            return;
        }
         
        if(index==size){
            addLast(data);
            return;
        }        
         
        Node node = new Node(data);
        Node prev = getNode(index-1);              
        node.next = prev.next;
        prev.next = node;         
        size++;        
    }
    
    void removeFirst(){  
         size--;
         if(head==null){            
            return;
        }
        head = head.next;
       
    }
    
    void remove(int index){    
        if(index>size-1){  
            System.out.println("Index out of bound");
            return;
        }            
        if(index==0){
           removeFirst();
            return;
        }
        if(index==size-1){
            removeLast();
            return;
        }
        Node prev = getNode(index-1);
        prev.next = prev.next.next;
        size--;
    }
    
    
    void removeLast(){
          if(head==null || head.next == null){  
              head=null;
              size--;
            return;
         }
        Node prev = head;
        while(prev.next.next != null){
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        // prev.next = prev.next.next;
        size--;
        
    }
 
    
    void print(Node curr){    
        if(curr==null){
             System.out.print("null");
            return;
        }
        while(curr.next!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    
     void print(){
        print(head);        
    }
    
    
    int get(int index){  
        if(index>size){             
            return -1;
        }
        Node curr=head;
        while(index-->0){
            curr=curr.next;
        }
        return curr.data;
    }
    
    Node getNode(int index){            
        Node node = head;
        while(index-->0){
            node=node.next;
        }
        return node;
    }
    
    
}

