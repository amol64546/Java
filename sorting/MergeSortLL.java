public class MergeSortLL 
{      
     static Node getAndcutMid(Node head){
        Node slow = head, fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast = fast.next.next;            
        }
        prev.next = null;  // cut
        return slow;
    }
    
    static Node mergeSort(Node left, Node right){
        Node dummy = new Node();
        Node curr = dummy;
        while(left!=null && right!=null ){
            if(left.data<right.data){
                curr.next = left;
                left = left.next;
            }else{
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        
        curr.next = (left!=null) ? left:right;
        return dummy.next;
    }
    
     static Node divide(Node head)
    {
        if(head==null || head.next==null) return head;
        Node mid = getAndcutMid(head);   // dividing into two
        Node left = divide(head);
        Node right = divide(mid);
        return mergeSort(left,right);        
    }
    
    
    public static void main (String[] args) throws java.lang.Exception
	{	    
        int n = 5;        
        int[] arr = {5,6,8,4,1,2}; 
        MyLL list = new MyLL();
        for(int i: arr)
            list.add(i); 
       
        Node newHead = divide(list.head);
        while(newHead!=null){
            System.out.print(newHead.data+" ");
            newHead = newHead.next;
        }
             
	}   
    
    
    
}
