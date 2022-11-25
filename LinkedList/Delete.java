package SinglyLL;

public class Delete {

 void removeLast(Node head){
          if(head==null || head.next == null){  
              head=null;
            return;
         }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr= null;
       
    }

    static Node data(Node head, int val){
       
//        if(head == null || head.next == null){
//                return null;
//         }  

        Node prev=null, curr=head;
        while(curr.next != null && curr.val != val){
            prev = curr;
            curr = curr.next;
        }

        if(prev == null){          
            return null;
        }

        prev.next = curr.next;            
        

        return head;
    }
    static Node midNode(Node head){
//        if(head == null || head.next == null){
//                return null;
//         } 
     Node prev=null, slow=head, fast=head;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(prev == null){          
            return null;
        }
        prev.next = prev.next.next;         
    return head;
    }
    static void node_withoutHead(Node node){
        node.val = node.next.val;
        node.next = node.next.next;        
    }

    static Node node(Node head, int pos){
        if(head == null) return null;
        if(head.next == null) return new Node(-1);
        
        if(pos==0){
            return head.next;
        }

        Node temp = head;
        for(int i=0; i<pos-1; i++){  
            temp = temp.next;          
        }
        temp.next = temp.next.next;
        return head;

    }
}
