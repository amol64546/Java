public class Merge2sortedList {
    public static Node merge(Node list1, Node list2){
            
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        
        Node dummy = new Node(0);        
        Node temp = dummy;
        
        while(list1!=null && list2!=null){
            if(list1.data < list2.data){                
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

 public static void main(String[] args) {
        
        int n = 5;        
        int[] arr1 = {1,2,3,4,5}; 
        MyLL l1 = new MyLL();        
        for(int i=0; i<n; i++){
            l1.add(arr1[i]);
        }

        int m = 4;        
        int[] arr2 = {2,5,6,9}; 
        MyLL l2 = new MyLL();        
        for(int i=0; i<m; i++){
            l2.add(arr2[i]);
        }        
        Node head = merge(l1.head, l2.head);
        MyLL.print(head);
        
        
    }    
}
