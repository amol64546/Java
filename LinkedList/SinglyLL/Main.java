package SinglyLL;


public class Main {
   
    
    public static void main(String[] args) {
        
        int n = 5;        
        int[] arr1 = {1,2,3,4,5}; 
        LinkedList l1 = new LinkedList();        
        for(int i=0; i<n; i++){
            l1.addLast(arr1[i]);
        }

        int m = 4;        
        int[] arr2 = {2,5,6,9}; 
        LinkedList l2 = new LinkedList();        
        for(int i=0; i<m; i++){
            l2.addLast(arr2[i]);
        }        
        Node head = Merge.merge(l1.head, l2.head);
        Print.print(head);
        
        
    }    
    
}

