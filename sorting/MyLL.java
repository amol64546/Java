

public class MyLL{
     Node head, tail;    
      void add(int data){
        Node n = new Node(data);
        if(head==null){
            head = n; 
            tail = n; 
            return;          
        }             
        tail.next = n;
        tail = n;             
    }  
    static void print(Node head){
        if(head==null){
            System.out.println("null");
            return;
        }            
        Node temp = head;
        while(temp != null){
          
            if(temp.next!=null)
                System.out.print(temp.data+"->");
            else
                System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();

    }
}
