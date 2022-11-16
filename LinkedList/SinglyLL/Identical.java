package SinglyLL;

public class Identical {
    public static boolean  isIdentical (Node head1, Node head2){
        while(head1!=null && head2!=null){
            if(head1.val!=head2.val){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return (head1==null && head2==null);
  
    }
}
