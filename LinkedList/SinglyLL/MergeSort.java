package SinglyLL;

public class MergeSort {
    public static Node sort(Node head){

        if(head==null || head.next==null)
            return head;
        Node mid = getMid(head);
        Node left= sort(head);
        Node right = sort(mid);
        return Merge.merge(left,right);

    }

    static Node getMid(Node head){
    
             Node prev=null, slow=head, fast=head;
                while(fast != null && fast.next != null){
                    prev = slow;
                    slow = slow.next;
                    fast = fast.next.next;
                }
        
                if(prev == null){          
                    return null;
                }
                prev.next = null;         // breaking at mid
            return slow;
            }
}
