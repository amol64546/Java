package SinglyLL;

public class Reverse {

 static void printReverse(Node temp){
        if(temp==null) return;
        printReverse(temp.next);
        System.out.print(temp.val+" ");
}

    static Node reverse(Node head){
        Node prev=null, curr=head;
        while(curr != null){
                Node next = curr.next;
                curr.next = prev;  // reversing
                // update
                prev = curr;
                curr = next;   // alert
        }
        return prev;
    }

    static Node recursiveReverse(Node head){
        if(head == null || head.next == null)
            return head;          
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void revAlternateNodes(Node head){
        Node oddPtr = head, evenPtr = head.next, temp = head.next;
        
        while(oddPtr!=null || evenPtr!=null){
            oddPtr.next = oddPtr.next.next;   
            oddPtr = oddPtr.next;            
           
            evenPtr.next = oddPtr.next; 
            evenPtr = evenPtr.next;           
        }
        Node temp2 = Reverse.reverse(temp);
        oddPtr.next = temp2;
        
    }
}
