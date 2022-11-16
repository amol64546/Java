package SinglyLL;

public class Merge {
    public static Node merge(Node list1, Node list2){
            
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        
        Node dummy = new Node(0);        
        Node temp = dummy;
        
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){                
                temp.next = list1;
                list1 = list1.next;               
            }else{
                temp.next = list2;
                list2 = list2.next;                
            }
            temp = temp.next;
        }
       
        temp.next = (list1!=null)? list1:list2;
        
        return dummy.next;

    }
}
